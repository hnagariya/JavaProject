package practicalQInterview;

import java.util.Arrays;

public class MaxNumberInArray {
	int[] number = { 2, 5, 4, 4, 2, 42, 55, 21, 3 };

	public void FindMaxNumberInArray() {
		int x = 0;
		for (int i = 0; i < number.length; i++) {
			for (int j = i + 1; j < number.length; j++) {
				if (number[i] < number[j]) {
					x = number[i];
					number[i] = number[j];
					number[j] = x;
				}
			}
		}
		System.out.println(Arrays.toString(number));
		System.out.println("Max number in Array is: " + number[0]);
		System.out.println("Min Number in Array is: " + number[number.length - 1]);
	}
}
