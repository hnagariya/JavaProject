package cellPhone;

import java.util.Scanner;

public class CellPhoneMain {

	public static void main(String[] args) {
		System.out.println("Please select the phone brand:Samsung or Apple");
		Scanner sc = new Scanner(System.in);
		String cellPhoneBrand = sc.nextLine();
		CellPhone cellPhone = new CellPhone(cellPhoneBrand);
		cellPhone.selectModelType();
		cellPhone.monthlyPhoneTab();
		cellPhone.selectPlanType();
		cellPhone.montlyPlanPrice();
		cellPhone.monthlyAmount();
	}

}
