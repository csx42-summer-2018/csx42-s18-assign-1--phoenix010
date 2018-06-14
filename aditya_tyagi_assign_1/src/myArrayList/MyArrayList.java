package myArrayList;

/**
 * This class generates an arraylist of fixed size.
 * We are using arrays in place of list interface for this assignment.
 */
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;
import myArrayList.util.Fileprocessor;

/**
 * 
 * @author aditya
 *
 */
public class MyArrayList {
	private static Scanner scanner = new Scanner(System.in);
	private int[] arr = new int[50];
	int ctr;

	public MyArrayList() {
		this.arr = arr;
		this.ctr = ctr;
	}

	/**
	 * The method converts the input String into primitive integer type. We are
	 * also checking the exceptions if we are unable to convert the String due to
	 * some invalid inputs
	 * 
	 * @param str. This String is generated by the user.
	 * @return result. This is an array of primitive integer type. Its items are
	 *         same as that of str
	 */
	public static int[] stringArrayToIntArray(String str) {
		String[] intStringSplit = str.split("\n"); // Split by spaces
		int[] result = new int[intStringSplit.length]; // Used to store our ints
		try {
			for (int i = 0; i < intStringSplit.length; i++) {
				// parse and store each value into int[] to be returned
				result[i] = Integer.parseInt(intStringSplit[i]);
			}
			return result;
		} catch (NumberFormatException e) {
			System.out.println("Please deleate the space or new line at the start of the input file");
			return null;
		}
	}

	/**
	 * Method calculates size of the Array.
	 * 
	 * @param data.This is the array which is given by the user
	 * @return size. This is a primitive integer type variable which stores the size
	 *         of array.
	 */

	public static int sizeArr(int[] data) {
		int size = data.length;
		return size;
	}

	/**
	 * Method is going to take an item from the user. Then its going to sort that
	 * array including that item and then return that sorted array
	 * 
	 * @param data.This is the array which is given by the user
	 * @return newArr. This is an array which is sorted after the insertion of the
	 *         new value by the user
	 */
	public static int[] insertSorted(int[] data) { // insertion of a new value and then insertion will happen
		Scanner scanner = new Scanner(System.in);
		System.out.println("print the value which you want to insert");
		int size = data.length + 1;
		// System.out.println(data.length);
		// System.out.println(strLen);
		int value = scanner.nextInt();
		scanner.nextLine();
		int[] newArr = Arrays.copyOf(data, size);
		newArr[size - 1] = value;
		System.out.println(Arrays.toString(newArr));
		newArr = sortedArray(newArr);
		System.out.println(Arrays.toString(newArr));
		return newArr;
	}

	/**
	 * Method is going to do sorting. The method compares each item in the array
	 * and then sort them in increasing order
	 * 
	 * @param arr. arr is an array which consists the item which is required to be
	 *            added in the array
	 * @return arr2. arr2 is an array sorted in an increasing order after inserting
	 *         the new item
	 */
	private static int[] sortedArray(int[] arr) { // sorting of array in an increasing order.
		int[] arr2 = new int[arr.length];
		for (int i = 0; i < arr.length; i++)
			arr2[i] = arr[i];
		boolean flag = true;
		int temp;
		while (flag) {
			flag = false;
			for (int i = 0; i < arr2.length - 1; i++) {
				if (arr2[i] > arr2[i + 1]) {
					temp = arr2[i];
					arr2[i] = arr2[i + 1];
					arr2[i + 1] = temp;
					flag = true;
				}
			}
		}
		return arr2;
	}

	/**
	 * Method iterates entire array in order to calculate the sum of all values
	 * stored in the array
	 * 
	 * @param data. data is the array which is given by the user
	 * @return sum. sum is  the resultant of all values stored in the array
	 */
	public static int sumArr(int[] data) {
		int sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum = sum + data[i];
		}
		return sum;
	}

	/**
	 * Calculates the index position of the value given by the user in the array.
	 * The array is required to be in sorted order. If unsorted, then it will
	 * calculate the index position of the first occurrence of the value. If the
	 * value is not found, then, it will return -1 to the calling function
	 * 
	 * @param data. data is the array which is given by the user
	 * @param item. The value whose index position is required to calculate
	 * @return i. i is the index position of the value. If not found, then, it
	 *         return -1 to the calling function
	 */
	public static int indexOf(int[] data, int item) {
		for (int i = 0; i < data.length; i++) {
			if (data[i] == item) {
				return i;
			}

		}
		return -1;
	}

	/**
	 * Method will remove all the occurrence of the value in the array. We have
	 * inserted all our array elements into an Integer List and then we remove the
	 * value from the list. At the end, we have converted List into primitive data
	 * type using the concept of unboxing.
	 * 
	 * @param input. Input is the array which is given by the user
	 * @return input. Input is the array which don't have value given by the user.
	 */
	public static int[] removeAllOccurences(int[] input) {
		System.out.println("Eneter the item you want to remove: ");
		int number = scanner.nextInt();
		int count = indexOf(input, number);
		if (count > -1) {
			List<Integer> result = new LinkedList<Integer>();
			for (int item : input) {
				if (item != number) {
					result.add(item);
				}
			}
			Integer[] scores = result.toArray(new Integer[result.size()]);
			System.out.println(Arrays.toString(scores));

			int[] data = new int[result.size()];
			for (int i = 0; i < result.size(); i++) {
				data[i] = result.get(i);
			}
			return data;
		} else {
			System.out.println("THe item which you are trying to deleate is not in the arraylist");
			return input;
		}
	}

	/**
	 * Method prints the Array in an elegant manner
	 * 
	 * @param arr. arr is the array which is given by the user
	 */
	public static void printArray(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}

}