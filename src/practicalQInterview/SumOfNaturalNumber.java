package practicalQInterview;

import java.util.Scanner;

public class SumOfNaturalNumber {
	Scanner sc = new Scanner(System.in);
	int x;
	int sum;
	int y;
	int factorial;

	public void getSumOfNaturalNumber() {
		System.out.println("please enter the number for that you want to get sum of natural number");
		x=sc.nextInt();
		for(int i=0;i<=x;i++) {
			sum+=i;
			}
		System.out.println(sum);
	}
	public void findFactorialOfNumber() {
		System.out.println("Please enter a number to find factorial");
		y=sc.nextInt();
		for (int i=1;i<=y;i++) {
			factorial *=i;
		}
	}

}
