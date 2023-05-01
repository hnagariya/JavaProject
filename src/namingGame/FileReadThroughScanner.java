package namingGame;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadThroughScanner {
	
	void fileThroughScanner() throws FileNotFoundException {
	File file=new File("C:\\Users\\Neelam Nagariya\\Desktop\\Testing\\Java\\Assignment\\Week 5 Assignment\\NameList.txt");
	Scanner sc  =new Scanner(file);
	int counter=0;
	String s="";
	while (sc.hasNextLine()) {
		 s=sc.nextLine();
		System.out.println(s);
		counter++;
	}
	String[] name=new String[counter];
	for(int i=0;i<name.length; i++) {
		name[i]=s;
		System.out.println(s);
	}
 sc.close();
}}
