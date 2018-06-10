package myArrayList.util;

import java.io.File;
import java.util.Scanner;

public class Fileprocessor {
	public void readLine(String file) throws Exception {
		// pass the path to the file as a parameter
		
		// Reference: "https://www.geeksforgeeks.org/different-ways-reading-text-file-java/"
	    File file1= new File("file.txt");
	    Scanner sc = new Scanner(file1);
	 
	    while (sc.hasNextLine())
	      System.out.println(sc.nextLine());
	    sc.close();
		}
	
}
