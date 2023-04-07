package arrayAssignment;

public class arrrayAssignmentMain {

	public static void main(String[] args) {
		PhoneBrand phoneBrandDisplay = new PhoneBrand();
		
		phoneBrandDisplay.displayAvailableProductOfPhoneBrand();
		System.out.println("******************************************************");
		SelectPhoneBrandProductList productList=new SelectPhoneBrandProductList();
		productList.displayAvailableProductOfPhoneBrand();
	}

}
