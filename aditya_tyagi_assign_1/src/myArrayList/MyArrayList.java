package myArrayList;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import java.util.List;

import myArrayList.util.Fileprocessor;
public class MyArrayList {
	private static Scanner scanner = new Scanner(System.in);
	private static String str;
	private int[] array = new int[50];
	
public MyArrayList(String str, int[] array) {
		super();
		this.str = str;
		this.array = array;
	}
public static void main(String args[]) throws IOException {
	
	Fileprocessor fileprocessor = new Fileprocessor();
	str = fileprocessor.readLine("file");
	System.out.println(str.length());
	int [] data = new int[50]; 
	data = stringArrayToIntArray(str);
	
	

	
	
	System.out.println("Hello Work");
	int size = data.length;
	if(size >= 50) {
		
		//size = size + 25;
		
//		 data = newArray(data,size);
//		data = insertSorted(data);
		System.out.println(Arrays.toString(data));
		
	}
//	else {
//		//insertSorted(data); 
//		data = insertSorted(data);
//		System.out.println(Arrays.toString(data));
//	}
////	System.out.println("ENeter the element to find index:");
////	int element = scanner.nextInt();
////	scanner.nextLine();
////	 indexOf(data ,element);
	
}
public static int[] stringArrayToIntArray(String str) {
    String[] intStringSplit = str.split("\n"); //Split by spaces
    int[] result = new int[intStringSplit.length]; //Used to store our ints
try {
    for (int i = 0; i < intStringSplit.length; i++) {
        //parse and store each value into int[] to be returned
        result[i] = Integer.parseInt(intStringSplit[i]); 
    }
    return result;
}
catch(NumberFormatException e) {
	System.out.println("Please deleate the space or new line at the start of the input file");
	return null;
}
}
	

public static int[] newArray( int[] data, int size) {			// if size of array gets more than 50
		int size_1 = size+25;
		int [] newArr = new int[data.length + 25];
	
		
		//System.out.println(Arrays.toString(newArr));
//		insertSorted(data);
//		System.out.println(Arrays.toString(newArr));
	for(int i=0, j = 0; j<= data.length; j++) {
		newArr[i]= data[j];
		i++;
	}
	return newArr;
//		while(data.length >= newArr.length) {
//			int i ,j=0;
//			newArr[i] = data[j];
//			i++;
//			j++;
//			
		}
		

        
	public static int[] insertSorted(int[] data) {		//insertion of a new value and then insertion will happen
		Scanner scanner = new Scanner(System.in);
		System.out.println("print the value which you want to insert");
		int size = data.length +1;
		
		int value = scanner.nextInt();
		scanner.nextLine();
//		System.out.println(size);
		int [] newArr = Arrays.copyOf(data, size);
		newArr[size - 1]= value;
		int [] sortedArray = sortedArray(newArr);
		return sortedArray;
	}

	public static int[] sortedArray(int[] arr) {			// sorting of array in an increasing order.
		int [] arr2 = new int[arr.length];
		for(int i=0; i<arr.length; i++)
			arr2[i] = arr[i];
		boolean flag = true;
		int temp;
		while(flag) {
			flag= false;
			for(int i=0; i<arr2.length-1; i++) {
				if(arr2[i] > arr2[i+1]) {
					temp = arr2[i];
					arr2[i] = arr2[i+1];
					arr2[i+1] = temp;
					flag = true;
				}
			}
		}
		return arr2;
	}
	
//	public static int sum() {
//		int sum =0;
//		System.out.println("Sum of all ELements: ");
//		for(int i=0; i< data.length; i++) {
//			sum = sum +data[i];
//			}
//		return sum;
//	}
	private static int searchItem(int[] data , int element) {
		for (int i = 0; i < data.length;) {			
			   if (data[i] == element) {
				   return i; 
				   
				  }
			   		i++;
				   
		}
		return -1;
	}
	public static void removeAllOccurences() {
		
	}
	public static void indexOf(int[] data , int element) {
		int item = searchItem(data, element);
		if(item > 0)
			System.out.println("Index of item is: "+item);
		else
			System.out.println("ELement not found");
	}
	
	public static void printArray(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}

}
