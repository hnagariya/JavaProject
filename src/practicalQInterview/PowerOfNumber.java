package practicalQInterview;

import java.util.Scanner;

public class PowerOfNumber {
 int base;
 int power;
 int exponantResult=1;
 Scanner sc=new Scanner(System.in);
 public void getPowerOfnumber() {
	 System.out.println("please enter a number as a base");
	 base=sc.nextInt();
	 System.out.println("Please enter power of number");
	 power=sc.nextInt();
	 for(int i=1;i<=power;i++) {
		 exponantResult*=base;
	 }
	System.out.println(exponantResult);
 }
}
