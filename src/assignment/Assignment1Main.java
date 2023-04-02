package assignment;

public class Assignment1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargestNumber largest = new LargestNumber();
		largest.n1=5;
		largest.n2=44;
		largest.n3=22;
		largest.findLargestNumber();
		System.out.println("*******************************");
		
		ProductDiscount priceAfterDiscount = new ProductDiscount();
		priceAfterDiscount.originalPriceOfProduct = 100.0f;
		//priceAfterDiscount.Promo5 = true;
		priceAfterDiscount.Promo10 = true;
		//priceAfterDiscount.Promo20 = true;
		priceAfterDiscount.discountApplied();
		System.out.println("*******************************");
		
		DriverLicense eligibilityForLicense = new DriverLicense();
		eligibilityForLicense.age=20;
		//eligibilityForLicense.age=16;
		//eligibilityForLicense.age=17;
		eligibilityForLicense.G1=true;
		//eligibilityForLicense.G=true;
		eligibilityForLicense.G2=true;
		eligibilityForLicense.license();
}
}
