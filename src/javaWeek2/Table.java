package javaWeek2;

import java.util.Scanner;

public class Table {
	int n;
	Scanner sc = new Scanner(System.in);

	void tableOfNumber() {
		System.out.println("Please enter a number");
		n = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			int j = n * i;
			System.out.println(j);
		}

	}
}
