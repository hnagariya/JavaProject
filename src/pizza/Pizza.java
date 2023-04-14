package pizza;

import java.util.Scanner;

public class Pizza {
	double price;
	String size;
	boolean extraCheese;
	boolean pepporoni;
	Scanner sc = new Scanner(System.in);

	void pizzaBill() {
		System.out.println("Please select the size either small or medium or large,of pizza from list");
		size = sc.nextLine();
		
		if (size.equals("small")) {
			price = 15;
			System.out.println("Do you want to add pepporoni");
			pepporoni=sc.nextBoolean();
			if (pepporoni) {
				price += 2;
			}
		} else if (size.equals("medium")) {
			price = 20;
			if (pepporoni) {
				price += 3;
			}
		} else if (size.equals("large")) {
			price = 25;
			if (pepporoni) {
				price += 3;
			}
		}
		System.out.println("Do you want extra cheese?");
		extraCheese=sc.nextBoolean();
		if (extraCheese) {
			price += 1;
		}
		System.out.println("Your final bill is: " + price);
	}

}
