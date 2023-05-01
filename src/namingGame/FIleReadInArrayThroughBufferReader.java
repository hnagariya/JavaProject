package namingGame;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class FIleReadInArrayThroughBufferReader {
	String randomName;
	String randomNameDisplayed;
	String[] rName;

	String selectRandomWordFromFile() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(
				"C:\\Users\\Neelam Nagariya\\Desktop\\Testing\\Java\\Assignment\\Week 5 Assignment\\NameList.txt"));
		String line = "";
		int counter = 0;
		while ((line = reader.readLine()) != null) {
			counter++;
		}
		rName = new String[counter];
		BufferedReader reader1 = new BufferedReader(new FileReader(
				"C:\\Users\\Neelam Nagariya\\Desktop\\Testing\\Java\\Assignment\\Week 5 Assignment\\NameList.txt"));
		while ((line = reader1.readLine()) != null) {
			for (int i = 0; i < rName.length; i++) {
				rName[i] = line;
			}
		}
		reader.close();
		reader1.close();
		Random random = new Random();
		int index = random.nextInt(rName.length);
		randomName = rName[index];
		System.out.println(randomName);
		return randomName;
	}

}
