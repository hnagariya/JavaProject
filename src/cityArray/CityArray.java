package cityArray;

import java.util.Arrays;
import java.util.Scanner;

public class CityArray {
	String[] cityName = { "Toronto", "Ottawa", "Brampton", "Hamilton", "London", "Mississauga", "Burlington",
			"Kingston", "Kitchner" };
	Scanner sc = new Scanner(System.in);

	void isCityPresentInArray() {
		System.out.println("Please enter a city name. ");
		String enterCity = sc.nextLine();
		boolean isCityPresent = false;
		for (int i = 0; i < cityName.length; i++) {
			if (cityName[i].equals(enterCity)) {
				isCityPresent = true;
			}
		}
		if (isCityPresent) {
			System.out.println("City is found");
		} else {
			System.out.println("City not found");
		}
	}

	void findCityEndWithTon() {
		System.out.println("Cities ending with ton: ");
		for (int i = 0; i < cityName.length; i++) {
			if (cityName[i].substring(cityName[i].length() - 3).equals("ton")) {
				System.out.println(cityName[i]);
			}
		}
	}

	void replaceTonWithFunInCityName() {
		System.out.println("Replaced city name form ton to fun: ");
		for (int i = 0; i < cityName.length; i++) {
			if (cityName[i].substring(cityName[i].length() - 3).equals("ton")) {
				System.out.println(cityName[i].replace("ton", "fun"));
			}
		}
	}

	void getAddress() {
		int index = 0;
		String str = "100 queen street,Toronto,M5V 3E3";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ',') {
				index = i;
				break;
			}
		}
		String streetAddress = str.substring(0, index);
		String city = str.substring(index + 1, str.length() - 8);
		String postalCode = str.substring(str.length() - 7);
		System.out.println("Strret Address is: " + streetAddress);
		System.out.println("City is: " + city);
		System.out.println("Postal Code is: " + postalCode);

	}
}
