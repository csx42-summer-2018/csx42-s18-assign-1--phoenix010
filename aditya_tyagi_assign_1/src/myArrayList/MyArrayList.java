package myArrayList;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;
import myArrayList.util.Fileprocessor;


public class MyArrayList {
private static Scanner scanner = new Scanner(System.in);
private int[] arr =new int[50];
int ctr;

public MyArrayList() {
	this.arr = arr;
	this.ctr = ctr;
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
	public static int sizeArr(int[] data) {
		return data.length;
	}
        
	public static int[] insertSorted(int[] data) {		//insertion of a new value and then insertion will happen
		Scanner scanner = new Scanner(System.in);
		System.out.println("print the value which you want to insert");
		int size = data.length+1 ;
//		System.out.println(data.length);
//		System.out.println(strLen);
		int value = scanner.nextInt();
		scanner.nextLine();
		int [] newArr = Arrays.copyOf(data, size);
		newArr[size-1]= value;
		System.out.println(Arrays.toString(newArr));
		newArr = sortedArray(newArr);
		System.out.println(Arrays.toString(newArr));
		return newArr;
	}
	

	private static int[] sortedArray(int[] arr) {			// sorting of array in an increasing order.
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
	
	public static int sumArr(int[] data) {
		int sum =0;
		for(int i=0; i< data.length; i++) {
			sum = sum +data[i];
			}
		return sum;
	}
	
	public static int indexOf(int[] data , int item) {
		for(int i=0; i< data.length; i++) {
			if(data[i] == item) {
				return i;
			}
			
		}
		return -1;
	}
	public static int[] removeAllOccurences(int[] input) {
		System.out.println("Eneter the item you want to remove: ");
		int number = scanner.nextInt();
		int count = indexOf(input, number);
		if(count > -1) {
		List<Integer> result = new LinkedList<Integer>(); 
		for (int item : input) { 
			if (item != number) { 
				result.add(item); 
				} 
			} 
		Integer[] scores = result.toArray(new Integer[result.size()]);
		System.out.println(Arrays.toString(scores));
		
		int[] data = new int[result.size()];
		for(int i =0; i< result.size() ; i++) {
			data[i] = result.get(i);
		}
		return data;
		}
		else {
			System.out.println("THe item which you are trying to deleate is not in the arraylist");
		return input;
		}
}
	
	
	public static void printArray(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}

}