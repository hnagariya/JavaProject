package array;

import java.util.Arrays;

public class ArrayMultipleOf3And5 {
	int[] intArray = new int[10];
	//int x;
	int i=5;
	int finalx = 150;
	int j;

	void multipleOf3And5() {
		for (var x = 1; x <= finalx; x++) {
			if (x % 3 == 0 && x % 5 == 0) {
				intArray[j] = x;
				 j++;
			//	for (int i = j; i <= 9; i++) {
				//	intArray[i] = x;
					System.out.println(x);
				//	j++;
				//	break;
			//	}
			}

		}
		System.out.println(Arrays.toString(intArray));
	}
}
