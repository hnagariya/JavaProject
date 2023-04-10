package assignment;

public class ProductDiscount {
	float originalPriceOfProduct;
	float finalPrice;
	boolean Promo5;
	boolean Promo10;
	boolean Promo20;

	void discountApplied() {
		System.out.println("Actual price is  " + originalPriceOfProduct);
		finalPrice = originalPriceOfProduct * 0.5f;
		System.out.println("price after 50% is " + finalPrice);

		if (Promo5) {
			finalPrice = finalPrice * 0.05f;
			// System.out.println(finalPrice);
		} else if (Promo10) {
			finalPrice = finalPrice * 0.9f;
			// System.out.println(finalPrice);
		} else if (Promo20) {
			finalPrice = finalPrice * 0.8f;
			// System.out.println(finalPrice);
		}
		System.out.println("Price after discount: " +finalPrice);
	}
}
