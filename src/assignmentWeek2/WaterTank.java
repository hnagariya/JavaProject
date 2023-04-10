package assignmentWeek2;

public class WaterTank {
	int waterTank;
	int fillWaterTank;

	
	void waetrTankFill() {
		for (int a = waterTank; a <= fillWaterTank; a += 10) {
			if (waterTank <= fillWaterTank) {
				System.out.println("Water tank is filled: " + waterTank + "ml");
				waterTank+=10;
			}
		}
	}
}
