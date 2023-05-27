package javaFinalAssignment;

public interface SpaceShip {

	public boolean launch();

	public boolean land();

	public boolean canCarry(Items item, double maxWtAllowed, double cargoCarried);

	public double carry(Items item, double cargoCarried);

}
