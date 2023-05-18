package practicalQInterview;

import java.util.ArrayList;
import java.util.Scanner;

public class ArmstrongNumber {
	Scanner sc=new Scanner(System.in);
	ArrayList<Integer> integer=new ArrayList<Integer>();	
	
	public void checkIfUmberIsArmstrongN() {
		System.out.println("please enter a number to check if it is Armstrong number");
		int num=sc.nextInt();
		int powerOfDigit;
		int armstrongNumber=0;
		int digitsInNumber=0;
		int y= num;
		while(y!=0) {
			int x=y%10;
			y/=10;
			integer.add(x);
			
			digitsInNumber++;
		}
		for(int i=0;i<integer.size();i++) {
			System.out.println(integer.get(i));
			powerOfDigit=(int)Math.pow(integer.get(i), digitsInNumber);
			armstrongNumber+=powerOfDigit;
		}
		if( num==armstrongNumber) {
			System.out.println("entered number is Armstrong number");
		}
		else {
			System.out.println("enterd number is not Armstrong number");
		}
		
	}

}
