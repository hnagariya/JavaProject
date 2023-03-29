package JavaPackage1;

public class GasStove {
	String brandName;
	String type;
	boolean isAirFryer;
	String programmableControl;
	int Size;
	float price;

	void cook() {
		System.out.println("Is air fryer present:" + isAirFryer + ". cooking fries in Air fryer");
	}

	void bake() {
		System.out.println("Baking Potatoes in oven");
	}

	void grill() {
		System.out.println("I am grilling Paneer with set up of " + programmableControl + "");
	}

	void warmer() {
		System.out.println("Warmer is on");
	}

	void convectionCooking() {
		System.out.println("I donot use convection feature of oven.");
	}
	

}
