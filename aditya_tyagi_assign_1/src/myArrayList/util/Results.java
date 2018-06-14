package myArrayList.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

import myArrayList.MyArrayList;
import myArrayList.util.Fileprocessor;

public class Results implements StdoutDisplayInterface, FileDisplayInterface  {
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
	
	public void storeNewResult(String s) {
			System.out.println("Test "+s);
	}
	
	public void result_1() {
		System.out.println("No such File exception is passed successfully.So test NoSuchFile passed.");
		}
	public void result_2() {
		System.out.println("Since format of file is wrong. So we cant convert it into Int. Hence It leads to"
				+ "NumberFormatException, which in our case further leads to NullPointerException");
	}
	
}
