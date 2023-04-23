package namingGame;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class NamingGame {
	String randomName;
	String randomNameDisplayed;

	String selectRandomWordFromFile() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(
				"C:\\Users\\Neelam Nagariya\\Desktop\\Testing\\Java\\Assignment\\Week 5 Assignment\\NameList.txt"));
		ArrayList<String> name = new ArrayList<String>();
		try {
			String line = "";
			while ((line = reader.readLine()) != null) {
				name.add(line);
			}
		} finally {
			reader.close();
		}
		Random random = new Random();
		int index = random.nextInt(name.size());
		randomName = name.get(index);
	   // System.out.println(randomName);
		return randomName;
	}

	String displayRandomNameToUnderScores() {
		randomNameDisplayed = randomName;
		char[] randomNameDisplayedChar = randomNameDisplayed.toCharArray();
		for (int i = 0; i < randomName.length(); i++) {
			randomNameDisplayedChar[i] = '_';
		}
		randomNameDisplayed = String.valueOf(randomNameDisplayedChar);
		System.out.println(randomNameDisplayed);
		return randomNameDisplayed;
	}

	void matchEnteredLetterWithNameLetter() {
		Scanner sc = new Scanner(System.in);
		int l = 0;
		int counter = 0;
		boolean isLetterInRandomName = false;
		ArrayList<Character> arrayOfWrongGuessedLetter = new ArrayList<Character>();
		do {
			System.out.println(" Guess a letter: ");
			char enteredLetter = sc.next().charAt(0);
			for (int i = 0; i < randomName.length(); i++) {
				if (Character.toLowerCase(enteredLetter) == Character.toLowerCase(randomName.charAt(i))) {
					l = i;
					if (Character.toLowerCase(enteredLetter) == Character.toLowerCase(randomNameDisplayed.charAt(i))) {
						for (int j = l + 1; j < randomName.length(); j++) {
							if (enteredLetter == randomName.charAt(j)) {
								l = j;
								break;
							}
						}
					}
					isLetterInRandomName = true;
					break;
				}
			}
			if (isLetterInRandomName) {
				char[] randomNameDisplayedChar = randomNameDisplayed.toCharArray();
				randomNameDisplayedChar[l] = enteredLetter;
				randomNameDisplayed = String.valueOf(randomNameDisplayedChar);
				System.out.println(randomNameDisplayed);
				if (randomName.equalsIgnoreCase(randomNameDisplayed)) {
					counter = 5;
					System.out.println("You win! You have guessed " + randomName + " correctly");
				}
				isLetterInRandomName = false;
			} else {
				arrayOfWrongGuessedLetter.add(enteredLetter);
				counter++;
				System.out.println("you have guessed (" + counter + ") wrong letters: " + arrayOfWrongGuessedLetter);
				if (counter == 5) {
					System.out.println("Game over");
				}
			}
		} while (counter <= 4);
	}
}
