package calcualateCRS;

import java.util.Arrays;
import java.util.Scanner;

public class CalculateCRS {
	int score;
	String educationLevel;
	String[] education = { "Phd", "Masters Degree", "2 or more University Degree/Diplome with one 3years or more",
			"12th and 3 years or longer degree or diploma" };
	int educationPoint;
	int experiencePoint;
	int agePoint;
	int IELTSPointsListening;
	int IELTSPointsSpeaking;
	int IELTSPointsReading;
	int IELTSPointsWriting;
	int relativeInCanadaPoints;
	int studyInCanadaPoints;
	int workedInCanadaPoints;
	int totalPoint;
	Scanner sc = new Scanner(System.in);

	void educationScore() {
		System.out.println("Enter your Education Level from the list:");
		System.out.println(Arrays.toString(education));
		educationLevel = sc.nextLine();
		String operation = educationLevel;
		switch (operation) {
		case "Phd":
			educationPoint = 25;
			break;
		case "Masters Degree":
			educationPoint = 23;
			break;
		case "2 or more University Degree/Diplome with one 3years or more":
			educationPoint = 22;
			break;
		case "12th and 3 years or longer degree or diploma":
			educationPoint = 21;
			break;
		default:
			educationPoint = 0;
		}
		System.out.println("Points for your Education Level are: " + educationPoint);
	}

	void experienceScore() {
		System.out.println("Please enter your years of experience");
		int yearsOfExperience = sc.nextInt();
		if (yearsOfExperience >=6) {
			experiencePoint = 15;
		} else if (yearsOfExperience == 4 || yearsOfExperience == 5) {
			experiencePoint = 13;
		} else {
			experiencePoint = 0;
		}
		System.out.println("Points for your experience are: " + experiencePoint);
	}

	void ageScore() {
		System.out.println("Please enter your age");
		int age = sc.nextInt();
		if (age >= 18 && age <= 35) {
			agePoint = 12;
		} else {
			switch (age) {
			case 36:
				agePoint = 11;
				break;
			case 37:
				agePoint = 10;
				break;
			case 38:
				agePoint = 9;
				break;
			case 39:
				agePoint = 8;
				break;
			case 40:
				agePoint = 7;
				break;
			case 41:
				agePoint = 6;
				break;
			case 42:
				agePoint = 5;
				break;
			case 43:
				agePoint = 4;
				break;
			case 44:
				agePoint = 3;
				break;
			case 45:
				agePoint = 2;
				break;
			case 46:
				agePoint = 1;
				break;
			case 47:
				agePoint = 0;
			}
		}
		System.out.println("Your points for your age are: " + agePoint);
	}

	void IELTSListening() {
		System.out.println("Please enter your IELTS Listening Score");
		float listening = sc.nextFloat();
		if (listening >= 8.0f) {
			IELTSPointsListening = 6;
		} else if (listening == 7.5f) {
			IELTSPointsListening = 5;
		}
		System.out.println("Points for your IELTS Listening Score: " + IELTSPointsListening);
	}

	void IELTSSpeaking() {
		System.out.println("Please enter your IELTS Speaking Score");
		float speaking = sc.nextFloat();
		if (speaking >= 7.0f) {
			IELTSPointsSpeaking = 6;
		} else if (speaking == 7.5f) {
			IELTSPointsSpeaking = 5;
		}
		System.out.println("Points for your IELTS Speaking score: " + IELTSPointsSpeaking);
	}

	void IELTSReading() {
		System.out.println("Please enter your IELTS Reading Score");
		float reading = sc.nextFloat();
		if (reading >= 7.0f) {
			IELTSPointsReading = 6;
		} else if (reading == 7.5f) {
			IELTSPointsReading = 5;
		}
		System.out.println("Points for your IELTS Reading score: " + IELTSPointsReading);
	}

	void IELTSWriting() {
		System.out.println("Please enter your IELTS Writing Score");
		float writing = sc.nextFloat();
		sc.nextLine();
		if (writing >= 7.0f) {
			IELTSPointsWriting = 6;
		} else if (writing == 7.5f) {
			IELTSPointsWriting = 5;
		}
		System.out.println("Points for your IELTS Writing score: " + IELTSPointsWriting);
	}

	void familyInCanada() {
		String familyInCanada;
		boolean isRelativeInCanada = false;
		System.out.println(
				"If you have a relative  in Canada(Parents, Grand Parents, Brother, Sister, Aunt, Uncle, Nephew or Niece) who is a Canadian Citizen or PR holder(Y/N)");
		familyInCanada = sc.nextLine();
		if (familyInCanada.equals("Y")) {
			isRelativeInCanada = true;
		}
		if (isRelativeInCanada) {
			relativeInCanadaPoints = 5;
		}
		System.out.println("Points for relative in canada: " + relativeInCanadaPoints);
	}

	void studyInCanada() {
		boolean studyInCanada = false;
		String studyInCanadaYears;
		System.out.println("Have you studied in Canada for atleast 2 years (Y/N)");
		studyInCanadaYears = sc.nextLine();
		if (studyInCanadaYears.equals("Y")) {
			studyInCanada = true;
		}
		if (studyInCanada) {
			studyInCanadaPoints = 5;
		}
		System.out.println("Points for Study in canada: " + studyInCanadaPoints);
	}

	void workInCanada() {
		boolean workedInCanada = false;
		String workedInCanadaYears;
		System.out.println("Work in Canada for one year at NOC 0, A, B (Y/N)");
		workedInCanadaYears = sc.nextLine();
		if (workedInCanadaYears.equals("Y")) {
			workedInCanada = true;
		}
		if (workedInCanada) {
			workedInCanadaPoints = 5;
		}
		System.out.println("Points for work in canada: " + workedInCanadaPoints);

	}

	void totalPoint() {
		totalPoint = educationPoint + experiencePoint + agePoint + IELTSPointsListening + IELTSPointsSpeaking
				+ IELTSPointsReading + IELTSPointsWriting + relativeInCanadaPoints + studyInCanadaPoints
				+ workedInCanadaPoints;
		System.out.println("Total Points you have scored: " + totalPoint);
	}

	void eligibilityToImmCanada() {
		if (totalPoint >= 67) {
			System.out.println("You qualify to submit an Expression of Interest (EOI) to Immigration Canada");
		} else {
			System.out.println("You do not qualify to submit an Expression of Interest (EOI) to Immigration Canada");
		}
	}
}
