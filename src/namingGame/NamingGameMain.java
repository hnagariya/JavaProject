package namingGame;

import java.io.IOException;

public class NamingGameMain {

	public static void main(String[] args) throws IOException {
		NamingGame nameGame=new NamingGame();
		nameGame.selectRandomWordFromFile();
		nameGame.displayRandomNameToUnderScores();
		nameGame.matchEnteredLetterWithNameLetter();
	}

}

