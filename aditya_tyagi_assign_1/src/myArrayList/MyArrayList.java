package myArrayList;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import myArrayList.util.Fileprocessor;
public class MyArrayList {
	private static int [] data ;
	private static String str;
	
public MyArrayList(String str) {
		super();
		this.data = new int[50];
		this.str = str;
	}
public static void main(String args[]) throws IOException {
	Fileprocessor fileprocessor = new Fileprocessor();
	str = fileprocessor.readLine("file");
	//System.out.println(str);
	
	data = stringArrayToIntArray(str);
//	System.out.println("Aditya");
	System.out.println(Arrays.toString(data));

	int size = data.length;
	if(size >= 50) {
		size = size*2;
		newArray(data,size); 
	}
	else
		insertSorted(data); 
		
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

	public static void newArray(int[] arr, int size) {			// if size of array gets more than 50
		
		int [] newArr = Arrays.copyOf(arr, size);
		//System.out.println(Arrays.toString(newArr));
		insertSorted(arr);
	}
	public static void insertSorted(int[] arr) {		//insertion of a new value and then insertion will happen
		Scanner scanner = new Scanner(System.in);
		System.out.println("print the value which you want to insert");
		int value = scanner.nextInt();
		scanner.nextLine();
		arr[arr.length-1]= value;
		int [] sortedArray = sortedArray(arr);
		printArray(sortedArray);
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
	
	public static void printArray(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}

}
