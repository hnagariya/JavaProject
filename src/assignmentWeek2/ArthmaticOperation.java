package assignmentWeek2;
import java.util.Scanner;

public class ArthmaticOperation {
	int n1;
	int n2;;

	void addition() {
		int a = n1 + n2;
		System.out.println("Sum of n1 and n2 is " + a);
	}

	void substraction() {
		int b = n1 - n2;
		System.out.println("Substraction of n1 and n2 is " + b);
	}

	void multiplication() {
		int M = n1 * n2;
		System.out.println("Multiplication of n1 and n2 is " + M);
	}

	void division() {
		int Q = n1 / n2;
		int R = n1 % n2;
		System.out.println("Quotient of n1 and n2 is " + Q);
		System.out.println("Remainder of n1 and n2 is " + R);
	}

	void square() {
		int s1 = n1 * n1;
		int s2 = n2 * n2;
		System.out.println("Square of n1 is " + s1 + "." + "Square of n2 is " + s2 + ".");
	}

	void cube() {
		int c1 = n1 * n1 * n1;
		int c2 = n2 * n2 * n2;
		System.out.println("Cube of n1 is " + c1 + "." + "Cube of n2 is " + c2 + ".");
	}

	String operation;
	Scanner sc=new Scanner(System.in);

	void switchOperation() {
		System.out.println("Enter operation");
		operation=sc.next();

		switch (operation) {
		case "add":
			addition();
			break;
		case "difference":
			substraction();
			break;
		case "multiplication":
			multiplication();
			break;
		case "division":
			division();
			break;
		case "square":
			square();
			break;
		case "cube":
			cube();
			break;
		default:
			System.out.println("Invalid operation");
			break;

		}
	}
}
