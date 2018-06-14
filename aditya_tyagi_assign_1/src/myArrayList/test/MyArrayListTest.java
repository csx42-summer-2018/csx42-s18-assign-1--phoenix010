package myArrayList.test;

/**
 * Test Cases are genearted with this class
 */
import java.util.Arrays;

import myArrayList.MyArrayList;
import myArrayList.util.Results;

/**
 * 
 * @author aditya
 *
 */
public class MyArrayListTest {
	/**
	 * this method checks the validity of our test cases. If the test case passes or
	 * fails, then its calling the storeNewResult() defined in the Result.We have
	 * initialized an array for our test cases within this method
	 * 
	 * @param myArrayList.
	 *            Its an object of MyArrayList. It's required to call methods
	 *            defined in class MyArrayList.
	 * @param result.
	 *            Its an object of Results. It's required to call storeNewResult()
	 *            method defined in class Result.
	 */
	public void testMe(MyArrayList myArrayList, Results result) {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("***************RUNNING TEST CASES******************");
		System.out.println("***********Follow The Instructions Carefully*******");
		System.out.println();

		int[] data = new int[50];
		for (int i = 0; i < data.length; i++) {
			data[i] = i;
		}
		int ctr = 1;

		if (ctr == testInsertSum(data, myArrayList)) {
			System.out.println("Since Sum before and after Insertion is same.");
			result.storeNewResult(" Insertion & Sum Passed");
		} else
			result.storeNewResult(" Failed ");

		if (ctr == testInsertIndex(data, myArrayList)) {
			System.out.println("Since the index position of 100 is one less than the size of array."
					+ "So, it means that our insertion and indexing works well");
			result.storeNewResult(" Insert & Index Passed");
		} else
			result.storeNewResult(" Failed ");

		if (ctr == testInsertRemoval(data, myArrayList)) {
			System.out.println("Since the differnce between the sum of arrays after insertion"
					+ "and removal is 100. We Conclude that our insertion and removal works well");
			result.storeNewResult("Insertion & Removal Passed ");
		} else
			result.storeNewResult(" Failed ");

		if (ctr == testSizeRemoval(data, myArrayList)) {
			System.out.println("Since the differences in the sizes is 1. We "
					+ "conclude that our removal and size functionality works well");
			result.storeNewResult(" Removal & Size Passed ");
		}

		else
			result.storeNewResult(" Failed ");
		if (ctr == testSum(data, myArrayList)) {
			System.out.println("Since the sum of all values of array after deleting 1 is less than the sum of all values of array by 1. We conclude that our sum function works well ");
			result.storeNewResult("Sum passed");
		} else
			result.storeNewResult("Failed");

		if (ctr != testRemoveAllOccurences(data, myArrayList)) {
			System.out.println(
					"Since we cannot find 20 in our arraylist, we conclude that removeAllOccurence functioanlity works well ");
			result.storeNewResult(" removeAllOccurences passed ");
		} else
			result.storeNewResult(" failed ");
		if (ctr == testIndexing(data, myArrayList)) {
			System.out.println(
					"Since Indexing remains same even though there is duplication of 20. So, our indexing works well");
			result.storeNewResult("Indexing Passed");
		} else
			result.storeNewResult("Failed");
		if (ctr == testInsertionAtBoundary(data, myArrayList)) {
			System.out.println(
					"Since Insertion is done at the boundary condition.So, our Insertion at boundary condition works well");
			result.storeNewResult("Insertion At Boundary Condition Passed");
		} else
			result.storeNewResult("Failed");
		if (ctr == testRemovalAtBoundary(data, myArrayList)) {
			System.out.println("Since Deletion is done at Boundary Condition.So, our deleation works well");
		} else
			result.storeNewResult("Failed");
	}

	/**
	 * Method first calculate the sum. Then, we will insert a value in the array.
	 * After insertion, we will calculate the sum after insertion.Based on some
	 * logic, its going to return either 1 or 0 to the calling function
	 * 
	 * @param data.
	 *            This is the array defined in the testMe() method
	 * @param myArrayList.
	 *            Its an object of MyArrayList. It's required to call methods
	 *            defined in class MyArrayList.
	 * @return return either 1 or 0
	 */

	public int testInsertSum(int[] data, MyArrayList myArrayList) {

		int sum = myArrayList.sumArr(data);
		System.out.println("*****Verifying the sum functionality before and after insertion*******");
		System.out.println("NOTE: Sum before Insertion:" + sum);
		System.out.println("Instruction 1: Insert 0.");
		System.out.println(Arrays.toString(data));
		data = myArrayList.insertSorted(data);
		int sum_1 = myArrayList.sumArr(data);
		System.out.println("NOTE: Sum after Insertion: " + sum_1);
		if (sum == sum_1)
			return 1;
		else
			return 0;

	}

	/**
	 * Method is going to insert 100 and then calculate its index position. Then,
	 * the size of array is calculated. Based on defined conditions it's either
	 * going to return 1 or 0.
	 * 
	 * @param data.
	 *            This is the array defined in the testMe() method
	 * @param myArrayList:
	 *            Its an object of MyArrayList. It's required to call methods
	 *            defined in class MyArrayList.
	 * @return: return either 1 or 0
	 */

	public int testInsertIndex(int[] data, MyArrayList myArrayList) {
		System.out.println();
		System.out.println();
		System.out.println("*****Verifying the Indexing after Insertion*******");
		System.out.println("Instruction 2: Insert 100 ");
		data = myArrayList.insertSorted(data);
		int index = myArrayList.indexOf(data, 100);
		System.out.println("NOTE: Index of 100: " + index);
		int pos = data.length - 1;
		System.out.println("NOTE: Size of Array is: " + (pos + 1));
		if (index == pos)
			return 1;
		return 0;

	}

	/**
	 * Method will perform insertion by inserting 100 in the array. Then, we will
	 * calculate the sum of this array After that, we will delete 100form that
	 * array.Again, we will calculate the sum of this array. Then based on defined
	 * logic method returns 1 0r 0
	 * 
	 * @param data.
	 *            This is the array defined in the testMe() method
	 * @param myArrayList:
	 *            Its an object of MyArrayList. It's required to call methods
	 *            defined in class MyArrayList.
	 * @return: return either 1 or 0
	 */
	public int testInsertRemoval(int[] data, MyArrayList myArrayList) {
		System.out.println();
		System.out.println();
		System.out.println("*****Verifying Removal And Insertion *******");
		System.out.println("Instruction 3: Insert 100");
		data = myArrayList.insertSorted(data);
		int sum = myArrayList.sumArr(data);
		System.out.println("NOTE: Sum after Inserting 100: " + sum);
		System.out.println("Intruction 4: Delete 100");
		int[] newArr = myArrayList.removeAllOccurences(data);
		int sum_1 = myArrayList.sumArr(newArr);
		System.out.println("NOTE: Sum after deleating 100: " + sum_1);

		if ((sum_1 + 100) == sum)
			return 1;
		else
			return 0;

	}

	/**
	 * method first check the size of the array.After calculating its size, method
	 * removes 49. Again, the method check the size of the array.Based on defined
	 * conditions, method either returns 1 or 0
	 *
	 * @param data.
	 *            This is the array defined in the testMe() method
	 * @param myArrayList:
	 *            Its an object of MyArrayList. It's required to call methods
	 *            defined in class MyArrayList.
	 * @return: return either 1 or 0
	 */
	public int testSizeRemoval(int[] data, MyArrayList myArrayList) {
		System.out.println();
		System.out.println();
		int pos = data.length;
		System.out.println("*****Verifying the size and Removal*******");
		System.out.println("NOTE: Initially, size of our array is: " + pos);
		System.out.println("Intruction 5: Remove 49");
		int[] newArr = myArrayList.removeAllOccurences(data);
		int pos_1 = newArr.length;
		System.out.println("NOTE: Size of Array is after removing 49: " + pos_1);
		if (pos != pos_1)
			return 1;
		else
			return 0;
	}

	/**
	 * Method verifying the sum functionality. Method calculates the sum of all
	 * values of array. Then, it removes 1 from the array and then calculates the
	 * sum of the array. Based on defined conditions, method either returns 1 or -1.
	 * 
	 * @param data.
	 *            This is the array defined in the testMe() method
	 * @param myArrayList:
	 *            Its an object of MyArrayList. It's required to call methods
	 *            defined in class MyArrayList.
	 * @return: return either 1 or -1
	 */
	public int testSum(int[] data, MyArrayList myArrayList) {
		System.out.println();
		System.out.println();
		System.out.println("****Verifying Sum()****");
		int sum = myArrayList.sumArr(data);
		System.out.println("NOTE: Sum of array: " + sum);
		System.out.println("Instruction 6: Delete 1 from the array");
		int[] newArr = myArrayList.removeAllOccurences(data);
		int sum_1 = myArrayList.sumArr(newArr);
		System.out.println("NOTE: sum of items after deleting 1 from arraylist is:  " + sum_1);
		if (sum == (sum_1 + 1))
			return 1;
		else
			return -1;

	}

	/**
	 * method insert 20 in the array. Then, it's going to deleting all the
	 * occurences of 20 in the array. Based on defined conditions, method either
	 * returns -1 or 1.
	 * 
	 * @param data.
	 *            This is the array defined in the testMe() method
	 * @param myArrayList:
	 *            Its an object of MyArrayList. It's required to call methods
	 *            defined in class MyArrayList.
	 * @return: return either 1 or -1
	 */
	public int testRemoveAllOccurences(int[] data, MyArrayList myArrayList) {
		System.out.println();
		System.out.println();
		System.out.println("***********Verifying RemovalAllOccurences**********");
		System.out.println("Instruction 7: INsert 20 ");
		data = myArrayList.insertSorted(data);
		System.out.println("Intruction 8:  Remove all 20s ");
		data = myArrayList.removeAllOccurences(data);
		int item = myArrayList.indexOf(data, 20);
		System.out.println("NOTE: INdex position of 20");
		if (item == -1) {
			System.out.println(Arrays.toString(data));
			return -1;

		} else
			return 1;
	}

	/**
	 * method verifies the index functionality. Method will calculate the index
	 * position of 20. Then it is going to insert another 20. Based on defined
	 * conditions, method either returns 1 or 0
	 * 
	 * @param data.
	 *            This is the array defined in the testMe() method
	 * @param myArrayList:
	 *            Its an object of MyArrayList. It's required to call methods
	 *            defined in class MyArrayList.
	 * @return: return either 1 or 0
	 */
	public int testIndexing(int[] data, MyArrayList myArrayList) {
		System.out.println();
		System.out.println();
		System.out.println("********Verifying Indexing*********");
		int index = myArrayList.indexOf(data, 20);
		System.out.println("NOTE: Index of 20 is:  " + index);
		System.out.println("Instruction 8: Insert 20");
		data = myArrayList.insertSorted(data);
		int index_1 = myArrayList.indexOf(data, 20);
		System.out.println("NOTE: INdex of 20 after insertion: " + index_1);
		if (index == index_1)
			return 1;
		else
			return 0;
	}

	/**
	 * method checks the insertion functionality at the boundary condition. Method
	 * first prints the array. Then, it is going to insert 0 in the array. Based om
	 * defined conditions, method returns 1
	 * 
	 * @param data.
	 *            This is the array defined in the testMe() method
	 * @param myArrayList:
	 *            Its an object of MyArrayList. It's required to call methods
	 *            defined in class MyArrayList.
	 * @return: return either 1 or 0
	 */
	public int testInsertionAtBoundary(int[] data, MyArrayList myArrayList) {
		System.out.println();
		System.out.println();
		System.out.println("****************Verifying Insertion AtBoundary Condition*********** ");
		System.out.println("NOTE: Array before Insertion is: ");
		System.out.println(Arrays.toString(data));
		System.out.println("Instruction 1: Insert 0.");
		data = myArrayList.insertSorted(data);
		return 1;
	}

	/**
	 * Method checks the removeAllOccurences functionality. It deletes the last
	 * element of the array.
	 * 
	 * @param data.
	 *            This is the array defined in the testMe() method
	 * @param myArrayList:
	 *            Its an object of MyArrayList. It's required to call methods
	 *            defined in class MyArrayList.
	 * @return: return either 1 or 0
	 */
	public int testRemovalAtBoundary(int[] data, MyArrayList myArrayList) {
		System.out.println();
		System.out.println();
		System.out.println("***************Verifying Removal at boundary Condition*******");
		System.out.println("NOTE: Array before removing items");
		System.out.println(Arrays.toString(data));
		System.out.println("Instruction 1: Delete 49.");
		data = myArrayList.removeAllOccurences(data);
		return 1;
	}

}
