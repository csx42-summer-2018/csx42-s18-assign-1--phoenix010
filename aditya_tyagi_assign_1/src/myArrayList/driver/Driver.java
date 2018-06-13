package myArrayList.driver;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import myArrayList.MyArrayList;
import myArrayList.util.Fileprocessor;
import myArrayList.util.Result;


public class Driver {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		MyArrayList myArrayList = new MyArrayList();
		Result result = new Result();
		Fileprocessor fileprocessor = new Fileprocessor();
		String str = fileprocessor.readLine("file");
		//myArrayList.runCode(str);
		int strlen = str.length();
		if(strlen >= 50){
			int[] data_1 = new int [2*strlen];
			data_1 = myArrayList.stringArrayToIntArray(str);
			data_1 = myArrayList.insertSorted(data_1, strlen);
			data_1 = myArrayList.removeAllOccurences(data_1);
			//index
			System.out.println("ENeter the element to find index:");
			int item = scanner.nextInt();
			scanner.nextLine();
			int ctr = myArrayList.indexOf(data_1, item);
			if(ctr == -1)
				System.out.println("Item not in Array");
			else
				System.out.println("Index of Item is: "+ctr);
			System.out.println("Size of the array is: "+myArrayList.sizeArr(data_1));
			String str1 = Integer.toString(myArrayList.sumArr(data_1));
			result.writeToStdout(str1);
			result.writeToFile(str1);
					
		}
		
		else {
			int[] data = new int [50];
			data = myArrayList.stringArrayToIntArray(str);
			data = myArrayList.insertSorted(data, strlen);
			data = myArrayList.removeAllOccurences(data);
			//index
			System.out.println("ENeter the element to find index:");
			int item = scanner.nextInt();
			scanner.nextLine();
			int ctr = myArrayList.indexOf(data, item);

			if(ctr == -1)
				System.out.println("Item not in Array");
			else
				System.out.println("Index of Item is: "+ctr);
			System.out.println("Size of the array is: "+myArrayList.sizeArr(data));
			String str1 = Integer.toString(myArrayList.sumArr(data));
			result.writeToStdout(str1);
			result.writeToFile(str1);
		}
		
		
		
	
	
	}
}
