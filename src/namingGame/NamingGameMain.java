package namingGame;

import java.io.IOException;

public class NamingGameMain {

	public static void main(String[] args) throws IOException {
		FileReadThroughScanner fs=new FileReadThroughScanner();
		fs.fileThroughScanner();
		System.out.println("******************");
		FIleReadInArrayThroughBufferReader nm=new FIleReadInArrayThroughBufferReader();
		nm.selectRandomWordFromFile();
		System.out.println("******************************");
		NamingGame nameGame = new NamingGame();
		nameGame.selectRandomWordFromFile();
		nameGame.displayRandomNameToUnderScores();
		nameGame.matchEnteredLetterWithNameLetter();
	}

}
