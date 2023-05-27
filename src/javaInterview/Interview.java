package javaInterview;

import java.util.ArrayList;
import java.util.Arrays;

public class Interview {
	ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(2, 3, 2, 2, 5, 3));
	ArrayList<Integer> num1=new ArrayList<Integer>();
	int count = 1;
	// int maxCount =0;
	int x;

	public void getDuplicatevaluesInArrayList() {
		for (int i = 0; i < num.size(); i++) {
			for (int j = (i + 1); j < num.size(); j++) {
				if (num.get(i) == num.get(j)) {
					count++;
				x = num.get(i);
				}
			}
		}
		System.out.println(x);
	//	System.out.println(count);
	}

}
