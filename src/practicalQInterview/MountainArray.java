package practicalQInterview;

public class MountainArray {
	int[] mountainArray = { 1, 5, 8, 11, 9, 7, 3 };
	boolean isMountainArray;

	public void checkIfMountainArray() {
		int l=0;
	if(mountainArray.length%2==0) {
		l=mountainArray.length/2;
	}
	else {
		l=mountainArray.length/2+1;
	}
	if(mountainArray.length<3) {
		isMountainArray=false;
	}
	for(int i=0;i<l;i++) {
      if (mountainArray[i]>mountainArray[i+1]) {
    	  isMountainArray=false;
    	  break;
      }
      }
	for (int i=mountainArray.length-l;i<mountainArray.length;i++) {
		if(mountainArray[i]<mountainArray[i+1]) {
			isMountainArray=false;
		}
	}
	if(isMountainArray) {
		System.out.println("Array is mountain Array");
	}
	else {
		System.out.println("Array is not mountain Array");
	}
}}
