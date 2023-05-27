package javaFinalAssignment;

public class R2 extends Rocket {
	public static double rocketCost = 120000000;
	public static double rocketWt = 18000;
	public static double maxWtAllowed = 29000;
	public static double maxCargoAllowed = maxWtAllowed - rocketWt;

	R2(double cargoCarried) {
		super(cargoCarried);
	}

	@Override
	public String toString() {
		return "R2:" + this.cargoCarried;
	}

	@Override
	public boolean launch() {
		double chanceOfExplosion = 0.04 * (cargoCarried / maxCargoAllowed);
		double randomNumber = Math.random() * 0.1;
		boolean isLaunchPossible = (randomNumber >= chanceOfExplosion) ? true : false;
		return isLaunchPossible;
	}

	@Override
	public boolean land() {
		double chanceOfCrash = 0.08 * (cargoCarried / maxCargoAllowed);
		double randomNumber = Math.random() * 0.1;
		boolean isLandPossible = (randomNumber >= chanceOfCrash) ? true : false;
		return isLandPossible;
	}

}
