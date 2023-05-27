package javaFinalAssignment;

public class Items {
	private String name;
	private int weight;

	public Items(String name, int weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return this.name + "-" + this.weight;
	}

	public int getWeight() {
		return weight;
	}
	

}
