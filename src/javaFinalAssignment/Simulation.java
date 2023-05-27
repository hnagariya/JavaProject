package javaFinalAssignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Simulation {
	String name;
	int weight;

	ArrayList<Items> item = new ArrayList<Items>();

	public void loadItems() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new FileReader(
				"C:\\Users\\Neelam Nagariya\\Desktop\\Testing\\Java\\Assignment\\Final_Assignment\\phase-1 (1).txt"));
		String line = "";
		try {
			while ((line = br.readLine()) != null) {
				String[] x = line.split("=");
				name = x[0];
				weight = Integer.parseInt(x[1]);
				item.add(new Items(name, weight));
			}
		} finally {
			br.close();
		}
		System.out.println(item.toString());
	}

	public ArrayList<R1> loadU1(ArrayList<R1> r1) {
		double cargoCarried = 0;
		int x = 0;
		do {
			for (int i = x; i < item.size(); i++) {
				if (cargoCarried <= R1.maxCargoAllowed) {
					cargoCarried = item.get(i).getWeight() + cargoCarried;
					if (cargoCarried > R1.maxCargoAllowed) {
						cargoCarried = cargoCarried - item.get(i).getWeight();
						break;
					}
					x++;
				}
			}
			r1.add(new R1(cargoCarried));
			cargoCarried = 0;
		} while (x < item.size());
		System.out.println(r1.toString());
		return r1;
	}

	public ArrayList<R2> loadU2(ArrayList<R2> r2) {
		double cargoCarried = 0;
		int x = 0;
		do {
			for (int i = x; i < item.size(); i++) {
				if (cargoCarried <= R2.maxCargoAllowed) {
					cargoCarried = item.get(i).getWeight() + cargoCarried;
					if (cargoCarried > R2.maxCargoAllowed) {
						cargoCarried = cargoCarried - item.get(i).getWeight();
						break;
					}
					x++;
				}
			}
			r2.add(new R2(cargoCarried));
			cargoCarried = 0;
		} while (x < item.size());
		System.out.println(r2.toString());
		return r2;
	}

	public double runSimulation(ArrayList<R1> r1) {
		int rCount = 0;
		for (int i = 0; i < r1.size(); i++) {
			boolean a = r1.get(i).launch();
			if (a) {
				boolean b = r1.get(i).land();
				if (!b) {
					i--;
				}
			} else {
				i--;
			}
			rCount++;
		}
		double totalBudget = rCount * R1.rocketCost;
		return totalBudget;
	}

	public double runSimulation1(ArrayList<R2> r2) {
		int rCount = 0;
		for (int i = 0; i < r2.size(); i++) {
			boolean a = r2.get(i).launch();
			if (a) {
				boolean b = r2.get(i).land();
				if (!b) {
					i--;
				}
			} else {
				i--;
			}
			rCount++;
		}
		double totalBudget = rCount * R2.rocketCost;
		return totalBudget;
	}

}
