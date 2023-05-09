package composition;

public class Car {
	private String brandName;
	private String colour;
	private int seatingCapacity;
	private double priceOfCar;
	
	
	public Car() {
		super();
	}

	public Car(String brandName, String colour, int seatingCapacity, double priceOfCar) {
		super();
		this.brandName = brandName;
		this.colour = colour;
		this.seatingCapacity = seatingCapacity;
		this.priceOfCar = priceOfCar;
	}

	public double getPriceOfCar() {
		return priceOfCar;
	}

	public void setPriceOfCar(double priceOfCar) {
		this.priceOfCar = priceOfCar;
	}

	public String getBrandName() {
		return brandName;
	}

	public String getColour() {
		return colour;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}
}
