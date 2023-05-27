package javaFinalAssignment;

import java.io.IOException;
import java.util.ArrayList;

public class MissionToMarsMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Simulation simulation = new Simulation();
		simulation.loadItems();
		ArrayList<R1> r1 = new ArrayList<R1>(10);
		simulation.loadU1(r1);
		r1.get(0).launch();
		r1.get(0).land();
		double totalBudgetForR1 = simulation.runSimulation(r1);
		System.out.println("Total cost for R1 fleet: $" + totalBudgetForR1);
		ArrayList<R2> r2 = new ArrayList<R2>(10);
		simulation.loadU2(r2);
		double totalBudgetForR2 = simulation.runSimulation1(r2);
		System.out.println("Total cost for R2 fleet: $" + totalBudgetForR2);
	}

}
