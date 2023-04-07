package array;

public class ArrayMultipleOf3And5 {
	int[] intArray = new int[10];
	int x;
	int finalx =150;
	int j;

	void multipleOf3And5() {
		for (x =15; 
				x <=finalx; 
				x++) {
			if (x % 3 == 0 && x % 5 == 0) {
				for (int i = j;
						i <= 9; 
						i++) {
					intArray[i] = x;
					System.out.println(x);
					j++;
					break;
				}
			}

		}
	}
}
