package arrayAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class PhoneBrand {
	String[] sam = { "S20", "S21", "Flip3", "Fold3" };
	String[] goog = { "Google Pixel 6", "Gogle Pixel6 pro", "Google Pixel pro", "Google Pixel5" };
	String[] app = { "Iphone 12", "Iphone 12 mini", "Iphone 11", "Iphone 11Pro" };
	String phoneBrand;
	String productFromList;
	Scanner sc = new Scanner(System.in);

	void displayAvailableProductOfPhoneBrand() {
		System.out.println("Enter the phone brand. Either Samsung or Google or Apple.");
		phoneBrand = sc.nextLine();
		if (phoneBrand.equals("Samsung")) {
			System.out.println(Arrays.toString(sam));
		} else if (phoneBrand.equals("Google")) {
			System.out.println(Arrays.toString(goog));
		} else if (phoneBrand.equals("Apple")) {
			System.out.println(Arrays.toString(app));
		} else {
			System.out.println("entered phone brand is wrong");
		}
	}
}

/*	void selectProductFromList() {
		System.out.println("Select product from the display list");
		productFromList = sc.nextLine();
	//	if (phoneBrand.equals("Samsung")) {
			for (int i = 0; i < sam.length; i++) {
				if (productFromList.equals(sam[i])) {
					System.out.println("Product selected is: " + sam[i]);
				} else {
					System.out.println("Please select a product from list");
				}
			}
	//	}
	//	if (phoneBrand.equals("Google")) {
			for (int i = 0; i < goog.length; i++) {
				if (productFromList.equals(goog[i])) {
					System.out.println("Product selected is: " + goog[i]);
				} else {
					System.out.println("Please select a product from list");
				}
			}
	//	}
	//	if (phoneBrand.equals("Apple")) {
			for (int i = 0; i < app.length; i++) {
				if (productFromList.equals(app[i])) {
					System.out.println("Product selected is: " + app[i]);
				} else {
					System.out.println("Please select a product from list");
				}
			}
//		}
	}
}*/
