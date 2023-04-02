package assignmentWeek2;

public class WaterTank {
	int bucket;
	int waterTank;

	/*
	 * void fillWaterTank() { waterTank = bucket*10; while (bucket<=waterTank) {
	 * System.out.println(bucket); bucket+=10; } }
	 */
	void waetrTankFill() {
		for (int a = 10; a <= waterTank; a += 10) {
			if (a == waterTank) {
				System.out.println("Water tank is filled. Do not fill more.");
			}

		}

	}
}
