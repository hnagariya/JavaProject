package arrayAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class SelectPhoneBrandProductList {
	String[] sam = { "S20", "S21", "Flip3", "Fold3" };
	String[] goog = { "Google Pixel 6", "Gogle Pixel6 Pro", "Google Pixel Pro", "Google Pixel5" };
	String[] app = { "Iphone 12", "Iphone 12 mini", "Iphone 11", "Iphone 11Pro" };
	String phoneBrand;
	String productFromList;
	Scanner sc = new Scanner(System.in);

	void displayAvailableProductOfPhoneBrand() {
		System.out.println("Enter the phone brand. Either Samsung or Google or Apple.");
		phoneBrand = sc.nextLine();
		boolean inProductList = false;
		if (phoneBrand.equals("Samsung")) {
			System.out.println(Arrays.toString(sam));
			System.out.println("Select product from the display list");
			productFromList = sc.nextLine();
			for (int i = 0; i < sam.length; i++) {
				if (productFromList.equals(sam[i])) {
					System.out.println("Product selected is: " + sam[i]);
					inProductList = true;
					break;
				}
			}
		} else if (phoneBrand.equals("Google")) {
			System.out.println(Arrays.toString(goog));
			System.out.println("Select product from the display list");
			productFromList = sc.nextLine();
			for (int i = 0; i < goog.length; i++) {
				if (productFromList.equals(goog[i])) {
					System.out.println("Product selected is: " + goog[i]);
					inProductList = true;
					break;
				}
			}
		} else if (phoneBrand.equals("Apple")) {
			System.out.println(Arrays.toString(app));
			System.out.println("Select product from the display list");
			productFromList = sc.nextLine();
			for (int i = 0; i < app.length; i++) {
				if (productFromList.equals(app[i])) {
					System.out.println("Product selected is: " + app[i]);
					inProductList = true;
					break;
				}
			}
		} else {
			System.out.println("Enter correct phone brand");
		}
		if (!inProductList) {
			System.out.println("Error: Please select a product from the list");
		}
	}
}
