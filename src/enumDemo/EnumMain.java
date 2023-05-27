package enumDemo;

import java.util.Scanner;

public class EnumMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		USStates enteredState;
		do {
			System.out.println("Please enter state name");
			String EnteredStateName = sc.next();
			enteredState = USStates.getStateByName(EnteredStateName);
		    if(enteredState==null) {
		    	System.out.println("You have entered the wrong input");
		    }
		} while (enteredState == null);
		System.out.println(enteredState.isTaxApplicable);
	}

}
