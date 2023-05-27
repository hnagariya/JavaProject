package javaFinalAssignment;

public class Rocket implements SpaceShip {

	public double cargoCarried;

	public Rocket(double cargoCarried) {
		super();
		this.cargoCarried = cargoCarried;
	}

	@Override
	public boolean launch() {
		return true;
	}

	@Override
	public boolean land() {
		return true;
	}

	@Override
	public double carry(Items item, double cargoCarried) {
		cargoCarried = cargoCarried + item.getWeight();
		return cargoCarried;
	}

	@Override
	public boolean canCarry(Items item, double maxCargoAllowed, double cargoCarried) {
		boolean result = (item.getWeight() + cargoCarried <= maxCargoAllowed) ? true : false;
		return result;
	}
}
