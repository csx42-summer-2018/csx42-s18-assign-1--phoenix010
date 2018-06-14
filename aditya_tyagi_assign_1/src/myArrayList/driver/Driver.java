package myArrayList.driver;

import java.io.File;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.Arrays;
import java.util.Scanner;

import myArrayList.MyArrayList;
import myArrayList.util.Fileprocessor;
import myArrayList.util.Result;


public class Driver {
	static Result result = new Result();
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		MyArrayList myArrayList = new MyArrayList();
//		Result result = new Result();
		Fileprocessor fileprocessor = new Fileprocessor();
//		String str = fileprocessor.readLine("file");
		//myArrayList.runCode(str);
		try {
		String str = fileprocessor.readLine("file");
		int strlen = str.length();
		runCode(str, strlen);
		}
		catch(NoSuchFileException e) {
			System.out.println("File Not Found");
		}
		catch(NullPointerException e) {
			System.out.println("We are returning no Array(NullPointer) as Input file format is wrong.");
		}
	}
	

	
	public static void runCode(String str, int strlen)throws NullPointerException {
		strlen = str.length();
		if(strlen >= 50){
			int[] data_1 = new int [2*strlen];
			data_1 = MyArrayList.stringArrayToIntArray(str);
			data_1 = MyArrayList.insertSorted(data_1, strlen);
			data_1 = MyArrayList.removeAllOccurences(data_1);
			//index
			System.out.println("ENeter the element to find index:");
			int item = scanner.nextInt();
			scanner.nextLine();
			int ctr = MyArrayList.indexOf(data_1, item);
			if(ctr == -1)
				System.out.println("Item not in Array");
			else
				System.out.println("Index of Item is: "+ctr);
			System.out.println("Size of the array is: "+MyArrayList.sizeArr(data_1));
			String str1 = Integer.toString(MyArrayList.sumArr(data_1));
			resultCall(str1);
//			result.writeToStdout(str1);
//			result.writeToFile(str1);
					
		}
		
		else {
			int[] data = new int [50];
			data = MyArrayList.stringArrayToIntArray(str);
			data = MyArrayList.insertSorted(data, strlen);
			data = MyArrayList.removeAllOccurences(data);
			//index
			System.out.println("ENeter the element to find index:");
			int item = scanner.nextInt();
			scanner.nextLine();
			int ctr = MyArrayList.indexOf(data, item);

			if(ctr == -1)
				System.out.println("Item not in Array");
			else
				System.out.println("Index of Item is: "+ctr);
			System.out.println("Size of the array is: "+MyArrayList.sizeArr(data));
			String str1 = Integer.toString(MyArrayList.sumArr(data));
			resultCall(str1);
//			result.writeToStdout(str1);
//			result.writeToFile(str1);
		
		}
		
	
	}
	
	public static void resultCall(String str1) {
				result.writeToStdout(str1);
				result.writeToFile(str1);
	}
}


