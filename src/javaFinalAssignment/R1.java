package javaFinalAssignment;

public class R1 extends Rocket {
	public static double rocketCost = 100000000;
	static double rocketWt = 10000;
	static double maxWtAllowed = 18000;
	public static double maxCargoAllowed = maxWtAllowed - rocketWt;

	R1(double cargoCarried) {
		super(cargoCarried);
	}

	@Override
	public String toString() {
		return "R1:" + this.cargoCarried;
	}

	@Override
	public boolean launch() {
		double chanceOfExplosion = 0.05 * (cargoCarried / maxCargoAllowed);
		double randomNumber = Math.random() * 0.1;
		boolean isLaunchPossible = (randomNumber >= chanceOfExplosion) ? true : false;
		return isLaunchPossible;
	}

	@Override
	public boolean land() {
		double chanceOfCrash = 0.01 * (cargoCarried / maxCargoAllowed);
		double randomNumber = Math.random() * 0.1;
		boolean isLandPossible = (randomNumber >= chanceOfCrash) ? true : false;
		return isLandPossible;
	}

}
