package cellPhone;

import java.util.Scanner;

public class CellPhoneMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isCellPhoneBrandIncorrect = true;
		do {
			System.out.println("Please select the phone brand:Samsung or Apple");
			String cellPhoneBrand = sc.nextLine();
			CellPhone cellPhone = new CellPhone(cellPhoneBrand);
			if (cellPhoneBrand.equals("Samsung") || cellPhoneBrand.equals("Apple")) {
				cellPhone.selectModelType();
				cellPhone.getTabForModelType();
				cellPhone.selectPlanType();
				cellPhone.getMontlyPlanPrice();
				cellPhone.getTotalAmount();
			}
		} while (isCellPhoneBrandIncorrect);
		sc.close();
		
	}
}
