package myArrayList.driver;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;


public class Driver {
	public static void main(String[] args) 
    {
	int [] data = readFiles("file.txt");
	//System.out.println(Arrays.toString(data));
	int size = data.length;
	if(size >= 50) {
		size = size*2;
		newArray(data,size); 
	}
	else
		insertSorted(data); 
		
    }
	public static int[] readFiles(String file) {
	try {
			File f = new File(file);
			Scanner s = new Scanner(f);
			int ctrl = 0;
			while(s.hasNextInt()) {
				ctrl++;
				s.nextInt();
		}
		s.close();
	
			
			int[] arr =new int[ctrl];
			Scanner s1 = new Scanner(f);
			for(int i=0; i< arr.length; i++)
				arr[i]= s1.nextInt();
			
		return arr;
			
			}
		catch(Exception e) {
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
	

