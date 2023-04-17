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
	String[] apple = { "Iphone 14", "Iphone 14 Pro", "Iphone 14 Pro Max", "Iphone 14 Pro Mini" };
	Scanner sc = new Scanner(System.in);

	CellPhone(String cellPhoneBrand) {
		phoneBrand = cellPhoneBrand;
	}

	String selectModelType() {
		System.out.println("Please select model type.");
		if (phoneBrand.equals("Samsung")) {
			System.out.println(Arrays.toString(samsung));
		} else if (phoneBrand.equals("Apple")) {
			System.out.println(Arrays.toString(apple));
		}
		modelType = sc.nextLine();
		return modelType;
	}

	void monthlyPhoneTab() {
		String operation = modelType;
		switch (operation) {
		case "S22":
			tabPrice = 22;
			break;
		case "S22+":
			tabPrice = 35;
			break;
		case "S22 Ultra":
			tabPrice = 55;
			break;
		case "S22 FE":
			tabPrice = 20;
			break;
		case "Iphone 14":
			tabPrice = 30;
			break;
		case "Iphone 14 Pro":
			tabPrice = 40;
			break;
		case "Iphone 14 Pro Max":
			tabPrice = 65;
			break;
		case "Iphone 14 Pro Mini":
			tabPrice = 25;
			break;
		default:
			System.out.println("Invalid Model Type");
		}
	}

	String selectPlanType() {
		System.out.println("Please select plan.");
		System.out.println(Arrays.toString(plan));
		planType = sc.nextLine();
		return planType;
	}

	void montlyPlanPrice() {
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

	void monthlyAmount() {
		System.out.println("You have selected " + modelType + " with " + planType + " Plan.");
		System.out.println("Your phone tab will be: " + tabPrice);
		System.out.println("Your monthly plan will be: " + planPrice);
		int totalAmount = tabPrice + planPrice;
		System.out.println("Your monthly amount is: " + totalAmount);
	}

}
