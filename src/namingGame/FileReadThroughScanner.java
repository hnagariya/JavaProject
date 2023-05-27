package namingGame;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FileReadThroughScanner {

	void fileThroughScanner() throws FileNotFoundException {
		File file = new File(
				"C:\\Users\\Neelam Nagariya\\Desktop\\Testing\\Java\\Assignment\\Week 5 Assignment\\NameList.txt");
		Scanner sc = new Scanner(file);
		int counter = 0;
		String s = "";
		ArrayList<String> name=new ArrayList<String>();
		while (sc.hasNextLine()) {
			s = sc.nextLine();
			name.add(s);
			System.out.println(s);
			counter++;
		}
		System.out.println(name);

	}
}
