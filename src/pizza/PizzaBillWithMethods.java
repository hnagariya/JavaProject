package pizza;

import java.util.Scanner;

public class PizzaBillWithMethods {
	// String size;
	// boolean extraCheese;
	// boolean Pepporoni;
	double prize;
	Scanner sc = new Scanner(System.in);

	double pizzaSize(String size) {
		if (size.equals("small")) {
			prize = 15;
		} else if (size.equals("medium")) {
			prize = 20;
		} else if (size.equals("large")) {
			prize = 25;
		}
		return prize;
	}

	void pizzaWithExtraCheese(boolean extraCheese) {
		if (extraCheese) {
			prize += 1;
		}
	}

	void pizzaWithPepporoni(boolean pepporoni, String size) {
		if (pepporoni && size.equals("small")) {
			prize += 2;
		} else if (pepporoni && (size.equals("medium") || size.equals("large"))) {
			prize += 3;
		}
	}

	void finalPrizePizza() {
		System.out.println("Price of pizza is: " + prize);
	}
}
