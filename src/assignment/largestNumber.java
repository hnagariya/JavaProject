package assignment;

public class LargestNumber {
	int n1;
	int n2;
	int n3;
	int largestNumber;
	void findLargestNumber() {
		if(n1>n2)
		{
			largestNumber =n1;
		}	
		else 
		{
			largestNumber = n2;
		}
		if(largestNumber<n3)
		{
			largestNumber=n3;
		}
		System.out.println("largest number is  "+ largestNumber);
	}
}