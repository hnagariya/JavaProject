package javaWeek2;

public class TableOf2 {
	int number;
	void table2 (){
		int finalNumber = number*10;
		while (number<=finalNumber) {
			System.out.println(number);
			number +=2;
			}
		}
	void table3() {
		//int finalNumber = number*10;
		int finalNumber = number*2;
		do {
			System.out.println(number);
			number += 3;
		}
		while(number<=finalNumber);
	}
	}
	

	
