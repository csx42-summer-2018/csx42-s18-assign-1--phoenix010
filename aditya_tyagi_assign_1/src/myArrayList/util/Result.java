package myArrayList.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

import myArrayList.MyArrayList;
import myArrayList.util.Fileprocessor;

public class Result implements StdoutDisplayInterface, FileDisplayInterface  {
	 public void writeToStdout(String s) {
		
		System.out.println("The Sum of all elements in the array list is:  "+s );
		
	}
	//Reference: https://www.youtube.com/watch?v=72BEuCPMgTo
	public  void writeToFile(String s) {
		try {
			PrintStream myconsole = new PrintStream(new File("output_file"));
			System.setOut(myconsole);
			myconsole.print("The Sum of all elements in the array list is:  " +s);
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
	}
}
