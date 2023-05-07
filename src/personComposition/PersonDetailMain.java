package personComposition;

import java.util.Scanner;

public class PersonDetailMain {

	public static void main(String[] args) {
		PersonDetail kittu = new PersonDetail(33, "Kittu", "black", 4, "F");
		PersonDetail bulbul = new PersonDetail(28, "Bulbul", "black", 5, "F");
		PersonDetail meenu = new PersonDetail(24, "Meenu", "blue", 6, "F");
		PersonDetail sonu = new PersonDetail(34, "Sonu", "black", 7, "F");
		PersonDetail chutki = new PersonDetail(35, "Chutki", "black", 5, "F");
		PersonDetail[] person = { kittu, bulbul, meenu, sonu, chutki };
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the name of person to get age.");
		String personNameRequested = sc.next();
		PersonDetail pd = new PersonDetail();
		pd.personDetail(person);
		int ageForPersonNameRequested = pd.getAgeforPersonNameRequested(personNameRequested);
		System.out.println(ageForPersonNameRequested);
	}

}
