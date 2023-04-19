package cellPhone;

import java.util.Arrays;
import java.util.Scanner;

public class CellPhone {
	String phoneBrand;
	String modelType;
	String planType;
	int tabPrice;
	int planPrice;
	String[] plan = { "Rogers", "Bell", "Telus" };
	String[] samsung = { "S22", "S22+", "S22 Ultra", "S22 FE" };
	int[] samsungTabPrice = { 22, 35, 55, 20 };
	String[] apple = { "Iphone 14", "Iphone 14 Pro", "Iphone 14 Pro Max", "Iphone 14 Pro Mini" };
	int[] appleTabPrice = { 30, 40, 65, 25 };
	Scanner sc = new Scanner(System.in);

	CellPhone(String cellPhoneBrand) {
		phoneBrand = cellPhoneBrand;
	}

	String selectModelType() {
		boolean modelTypeEnteredInorrect = true;
		do {
			System.out.println("Please select model type.");
			if (phoneBrand.equals("Samsung")) {
				System.out.println(Arrays.toString(samsung));
			} else if (phoneBrand.equals("Apple")) {
				System.out.println(Arrays.toString(apple));
			}
			modelType = sc.nextLine();
			for (int i = 0; i < samsung.length; i++) {
				if (samsung[i].equals(modelType)) {
					modelTypeEnteredInorrect = false;
				}
			}
			for (int i = 0; i < apple.length; i++) {
				if (apple[i].equals(modelType)) {
					modelTypeEnteredInorrect = false;
				}
			}
		} while (modelTypeEnteredInorrect);

		return modelType;

	}

	void getTabForModelType() {
		for (int i = 0; i < samsung.length; i++) {
			if (samsung[i].equals(modelType)) {
				tabPrice = samsungTabPrice[i];
			}
		}
		for (int i = 0; i < apple.length; i++) {
			if (apple[i].equals(modelType)) {
				tabPrice = appleTabPrice[i];
			}
		}
	}

	/*
	 * void getMonthlyPhoneTabforModelType() { String operation = modelType; switch
	 * (operation) { case "S22": tabPrice = 22; break; case "S22+": tabPrice = 35;
	 * break; case "S22 Ultra": tabPrice = 55; break; case "S22 FE": tabPrice = 20;
	 * break; case "Iphone 14": tabPrice = 30; break; case "Iphone 14 Pro": tabPrice
	 * = 40; break; case "Iphone 14 Pro Max": tabPrice = 65; break; case
	 * "Iphone 14 Pro Mini": tabPrice = 25; break; default:
	 * System.out.println("Invalid Model Type"); } }
	 */

	String selectPlanType() {
		boolean isPlanTypeIncorrect = true;
		do {
			System.out.println("Please select plan.");
			System.out.println(Arrays.toString(plan));
			planType = sc.nextLine();
			for (int i = 0; i < plan.length; i++) {
				if (plan[i].equals(planType)) {
					isPlanTypeIncorrect = false;
				}
			}
		} while (isPlanTypeIncorrect);
		return planType;
	}

	void getMontlyPlanPrice() {
		String operation = planType;
		switch (operation) {
		case "Rogers":
			planPrice = 70;
			break;
		case "Bell":
			planPrice = 80;
			break;
		case "Telus":
			planPrice = 75;
			break;
		default:
			System.out.println("Invalid Plan Type");
		}
	}

	void getTotalAmount() {
		System.out.println("You have selected " + modelType + " with " + planType + " Plan.");
		System.out.println("Your phone tab will be: " + tabPrice);
		System.out.println("Your monthly plan will be: " + planPrice);
		int totalAmount = tabPrice + planPrice;
		System.out.println("Your monthly amount is: " + totalAmount);
	}

}
