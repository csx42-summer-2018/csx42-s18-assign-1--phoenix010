package myArrayList.driver;

/**
 * this is our main class. Its from here everything is going to start
 */
import java.io.File;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.Arrays;
import java.util.Scanner;

import myArrayList.MyArrayList;
import myArrayList.test.MyArrayListTest;
import myArrayList.util.Fileprocessor;
import myArrayList.util.Results;

/**
 * 
 * @author aditya
 *
 */
public class Driver {
	static Results result = new Results();
	static MyArrayList myArrayList = new MyArrayList();
	static MyArrayListTest myArrayListTest = new MyArrayListTest();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		MyArrayList myArrayList = new MyArrayList();

		MyArrayListTest myArrayListTest = new MyArrayListTest();
		Fileprocessor fileprocessor = new Fileprocessor();

		try {
			String str = fileprocessor.readLine("file");
			int strLen = str.length();
			runCode(str, strLen);

		} catch (NoSuchFileException e) {
			System.out.println("No Such File Found");
		} catch (NullPointerException e) {
			System.out.println("We are returning no Array(NullPointer) as Input file format is wrong.");
		}

	}

	/**
	 * Method calls several other functions in order to insert a value, removal
	 * all occurrences of a value, sum of all values in the array and calculates the
	 * size of the array, the index of a value in the array. We have to pass a
	 * String in this method. This method takes care of its conversion into
	 * primitive integer type array and the size of array too. Later, its going to
	 * print the sum of all values in an output file (which will be generated).
	 * 
	 * @param str.
	 *            Str is a String which is passed as an input.
	 * @param strLen.
	 *            strLen is the length of string
	 * @throws NullPointerException.
	 */
	public static void runCode(String str, int strLen)
			/* ,MyArrayListTest myArrayListTest) */ throws NullPointerException {
		strLen = str.length();
		if (strLen >= 50) {
			int[] data_1 = new int[strLen+(strLen/2)];
			data_1 = MyArrayList.stringArrayToIntArray(str);
			data_1 = MyArrayList.insertSorted(data_1);
			data_1 = MyArrayList.removeAllOccurences(data_1);
			// index
			System.out.println("ENeter the element to find index:");
			int item = scanner.nextInt();
			scanner.nextLine();
			int ctr = MyArrayList.indexOf(data_1, item);
			if (ctr == -1)
				System.out.println("Item not in Array");
			else
				System.out.println("Index of Item is: " + ctr);
			System.out.println("Size of the array is: " + MyArrayList.sizeArr(data_1));
			String str1 = Integer.toString(MyArrayList.sumArr(data_1));
			resultCall(str1);

		}

		else {
			int[] data = new int[50];
			data = MyArrayList.stringArrayToIntArray(str);
			data = MyArrayList.insertSorted(data);
			data = MyArrayList.removeAllOccurences(data);
			// index
			System.out.println("ENeter the element to find index:");
			int item = scanner.nextInt();
			scanner.nextLine();
			int ctr = MyArrayList.indexOf(data, item);

			if (ctr == -1)
				System.out.println("Item not in Array");
			else
				System.out.println("Index of Item is: " + ctr);
			System.out.println("Size of the array is: " + MyArrayList.sizeArr(data));
			String str1 = Integer.toString(MyArrayList.sumArr(data));
			resultCall(str1);

		}

	}

	/**
	 * Method calls the writeToStdout() of Results class.Then its going to call
	 * testMe() which is defined in the MyArrayListTest class
	 * 
	 * @param str1
	 *            : str1 is the sum of all values in the array. Its typecasted
	 *            earlier into String
	 */
	public static void resultCall(String str1) {
		result.writeToStdout(str1);
		System.out.println("Output file will be genearted after testing.");
		myArrayListTest.testMe(myArrayList, result);
		result.writeToFile(str1);
	}
}
