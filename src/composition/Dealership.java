package composition;

import java.util.Arrays;

public class Dealership {
	// private Car car;
	private Car[] carList = new Car[5];

	public void addCarToDealership(Car car) {
		for (int i = 0; i < carList.length; i++) {
			if (carList[i] == null) {
				carList[i] = car;
				break;}
			}
		}

	public void addCarToDealership(Car car, Car car1, Car car2) {
				// this.car = car;
				for (int i = 0; i < carList.length; i++) {
					if (carList[i] == null) {
						carList[i] = car;
						carList[i+1]=car1;
						carList[i+2]=car2;
						break;
					}
			}
				System.out.println(Arrays.toString(carList));
	}
}