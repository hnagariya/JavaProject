package practicalQInterview;

public class PracicalQInterviewMain {

	public static void main(String[] args) {
		ArmstrongNumber an =new ArmstrongNumber();
		an.checkIfUmberIsArmstrongN();
		System.out.println("****************");
		PowerOfNumber pe=new PowerOfNumber();
		pe.getPowerOfnumber();
		System.out.println("*******************");
		FibbonacciSeries fs=new FibbonacciSeries();
		fs.getFibbonacciSeries();
		System.out.println("*******************");
		PalindromeAndReverseString ps = new PalindromeAndReverseString();
		ps.getReverseString();
		ps.checkIfStringPalindrome();
		System.out.println("**************************");
		PrimeNumber pn = new PrimeNumber();
		pn.checkIfNumberisPrime();
		pn.displayPrimeNumbersBetweenTwoInterwal();
		System.out.println("************************");
		MaxNumberInArray maxNumberArray = new MaxNumberInArray();
		maxNumberArray.FindMaxNumberInArray();
		System.out.println("*************************");
		SubstringOfAnotherString ss=new SubstringOfAnotherString();
		ss.checkIfStringPartOfAnotherString();
		System.out.println("********************");
		RemoveSecondCharInEachWord rr=new RemoveSecondCharInEachWord();
		rr.removeSecondCharacterInEachWord();
		System.out.println("*************************");
		MultiplicationTable mt=new MultiplicationTable();
		mt.getMultiplicationTable();
		System.out.println("*****************");
		VowelOrConsonant vc=new VowelOrConsonant();
		vc.CheckIfLetterVowelOrConsonant();
		vc.checkIfPositiveOrNegative();
		System.out.println("***********************");
		SumOfNaturalNumber sn=new SumOfNaturalNumber();
		sn.getSumOfNaturalNumber();
		System.out.println("**********************");
		
		
	}

}
