package array;

public class ArrayMultipleOf3And5 {
	int[] intArray = new int[10];
	int x;
	int finalx = 300;
	int j;

	void multipleOf3And5() {
		for (x = 1; x <= finalx; x++) {
			if (x % 3 == 0 && x % 5 == 0) {
				// intArray[j] = x;
				// j++;
				for (int i = j; i <= 9; i++) {
					intArray[i] = x;
					System.out.println(x);
					j++;
					break;
				}
			}

		}
	}
}
