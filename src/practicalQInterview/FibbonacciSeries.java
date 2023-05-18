package practicalQInterview;

import java.util.Scanner;

public class FibbonacciSeries {
	int firstNum = 0;
	int secondNum = 1;
	int x;
	Scanner sc = new Scanner(System.in);

	public void getFibbonacciSeries() {
		System.out.println("Please entre a number to get fibbonacci series");
		x = sc.nextInt();
		for (int i = 1; i <= x; i++) {
			System.out.println(firstNum);
			int nextNum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = nextNum;
		}
	}
}
