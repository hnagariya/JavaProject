package practicalQInterview;

import java.util.Scanner;

public class MultiplicationTable {
	Scanner sc=new Scanner(System.in);
	int x;
	public void getMultiplicationTable() {
		System.out.println("Please enter a number to get table");
		x= sc.nextInt();
		System.out.println("Multiplication table of"+x+ "-");
		for (int i=1;i<=10;i++) {
			System.out.println(i +"x"+ x +"="+i*x);
		}
	}

}
