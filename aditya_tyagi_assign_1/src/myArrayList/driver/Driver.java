package myArrayList.driver;

import java.io.File;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.Arrays;
import java.util.Scanner;

import myArrayList.MyArrayList;
import myArrayList.test.MyArrayListTest;
import myArrayList.util.Fileprocessor;
import myArrayList.util.Results;


public class Driver {
	static Results result = new Results();
	static MyArrayList myArrayList = new MyArrayList();
	static MyArrayListTest myArrayListTest = new MyArrayListTest();
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		MyArrayList myArrayList = new MyArrayList();
//		Result result = new Result();
		MyArrayListTest myArrayListTest = new MyArrayListTest();
		Fileprocessor fileprocessor = new Fileprocessor();
//		String str = fileprocessor.readLine("file");
		//myArrayList.runCode(str);
		try {
		String str = fileprocessor.readLine("file");
		int strLen = str.length();
		runCode(str,strLen);
		
		}
		catch(NoSuchFileException e) {
			System.out.println("No Such File Found");
		}
		catch(NullPointerException e) {
			System.out.println("We are returning no Array(NullPointer) as Input file format is wrong.");
		}
		
			
		
		
	}
	
	public static void runCode(String str, int strLen)/*,MyArrayListTest myArrayListTest)*/throws NullPointerException {
		strLen = str.length();
		if(strLen >= 50){
			int[] data_1 = new int [2*strLen];
			data_1 = MyArrayList.stringArrayToIntArray(str);
			data_1 = MyArrayList.insertSorted(data_1);
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
//			myArrayListTest.testme(myArrayList, result);
//			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
//			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
//			System.out.println();
			resultCall(str1);
			
					
		}
		
		else {
			int[] data = new int [50];
			data = MyArrayList.stringArrayToIntArray(str);
			data = MyArrayList.insertSorted(data);
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
//			myArrayListTest.testme(myArrayList, result);
			resultCall(str1);
			
//			result.writeToStdout(str1);
//			result.writeToFile(str1);
		
		}
		
	}
	public static void callTest(MyArrayListTest myArrayListTest) {
				myArrayListTest.testme(myArrayList, result);
	}	
	public static void resultCall(String str1) {
				result.writeToStdout(str1);
				System.out.println("Output file will be genearted after testing.");
				myArrayListTest.testme(myArrayList, result);
				result.writeToFile(str1);
	}
}


