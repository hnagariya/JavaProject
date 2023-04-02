package assignmentWeek2;
import java.util.Scanner;

public class Chocolate {
	int chocolate;
	int finalChocolate;
	Scanner sc= new Scanner(System.in);

	void fillChocolate() {
		System.out.println("Enter chocolate count already in box.");
		chocolate= sc.nextInt();
		System.out.println("Enter chocolate count you want in box.");
		finalChocolate=sc.nextInt();

		for (int counter = chocolate; 
				counter <= finalChocolate; 
				counter += 5) {
			if (counter >= finalChocolate - 4) {
				System.out.println("chocolate box is filled with  " + counter);
			}
		}
	}
}
