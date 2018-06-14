package myArrayList.test;

import java.util.Arrays;

import myArrayList.MyArrayList;
import myArrayList.util.Results;

public class MyArrayListTest {
			public void testme(MyArrayList myArrayList, Results result) {
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("***************RUNNING TEST CASES******************");
				System.out.println("***********Follow The Instructions Carefully*******");
				System.out.println();

				int [] data = new int[50];
				for(int i=0; i< data.length; i++) {
					data[i]= i;
				}
				int ctr = 1;
				
				if(ctr == testInsertSum(data,  myArrayList)) {
					System.out.println("Since Sum before and after Insertion is same.");
					result.storeNewResult(" Insertion & Sum Passed");
				}
				else 
					result.storeNewResult(" Failed ");
				
				if(ctr == testInsertIndex(data, myArrayList)) {
					System.out.println("Since the index position of 100 is one less than the size of array."
							+ "So, it means that our insertion and indexing works well");
					result.storeNewResult(" Insert & Index Passed");
				}
				else
					result.storeNewResult(" Failed ");
				
				if(ctr == testInsertRemoval(data, myArrayList)) {
					System.out.println("Since the differnce between the sum of arrays after insertion"
							+ "and removal is 100. We Conclude that our insertion and removal works well");
					result.storeNewResult("Insertion & Removal Passed ");
				}
				else
					result.storeNewResult(" Failed ");
				
				if(ctr == testSizeRemoval(data, myArrayList)) {
					System.out.println("Since the differences in the sizes is 1. We "
							+ "conclude that our removal and size functionality works well");
					result.storeNewResult(" Removal & Size Passed ");
				}
				
				else
					result.storeNewResult(" Failed ");
				if(ctr == testSum(data, myArrayList)) {
					System.out.println("Since the sum_1 is less than sum by 1. We conclude that our sum function works well ");
					result.storeNewResult("Sum passed");
				}
				else
					result.storeNewResult("Failed");
				
				if(ctr!= testRemoveAllOccurences( data,  myArrayList)) {
					System.out.println("Since we cannot find 20 in our arraylist, we conclude that removeAllOccurence functioanlity works well ");
					result.storeNewResult(" removeAllOccurences passed ");
				}
				else
					result.storeNewResult(" failed ");
				if(ctr == testIndexing(data, myArrayList)) {
					System.out.println("Since Indexing remains same even though there is duplication of 20. So, our indexing works well");
					result.storeNewResult("Indexing Passed");
				}
				else
					result.storeNewResult("Failed");
			}
			
			public int testInsertSum(int[] data, MyArrayList myArrayList) {
				
				int sum = myArrayList.sumArr(data);
				System.out.println("NOTE: Sum before Insertion:"+sum);
				System.out.println("Instruction 1: Insert 0.");
				data = myArrayList.insertSorted(data);
				int sum_1 = myArrayList.sumArr(data);
				System.out.println("NOTE: Sum after Insertion: "+sum_1);
				if (sum == sum_1)
					return 1;
				else
					return 0;
				
			}
			public int testInsertIndex(int[] data, MyArrayList myArrayList) {
				System.out.println();
				System.out.println();
				
				System.out.println("Instruction 2: Insert 100 ");
				data = myArrayList.insertSorted(data);
				int index = myArrayList.indexOf(data,100);
				System.out.println("NOTE: Index of 100: "+index);
				int pos = data.length-1;
				System.out.println("NOTE: Size of Array is: "+(pos+1));
				if(index == pos)
					return 1;
				return 0;
				
			}
			public int testInsertRemoval(int[] data, MyArrayList myArrayList) {
				System.out.println();
				System.out.println();
				System.out.println("Instruction 3: Insert 100");
				data = myArrayList.insertSorted(data);
				int sum = myArrayList.sumArr(data);
				System.out.println("NOTE: Sum after Inserting 100: "+sum);
				System.out.println("Intruction 4: Delete 100");
				int[] newArr = myArrayList.removeAllOccurences(data);
				int sum_1 = myArrayList.sumArr(newArr);
				System.out.println("NOTE: Sum after deleating 100: "+sum_1);
				
				if((sum_1 + 100) == sum) 
					return 1;
				else
					return  0;
				
			}
			public int testSizeRemoval(int[] data, MyArrayList myArrayList) {
				System.out.println();
				System.out.println();
				int pos = data.length;
				System.out.println("NOTE: Initially, size of our array is: "+pos);
				System.out.println("Intruction 5: Remove 49");
				int[] newArr = myArrayList.removeAllOccurences(data);
				int pos_1 = newArr.length;
				System.out.println("NOTE: Size of Array is after removing 49: "+pos_1);
				if(pos != pos_1)
					return 1;
				else
					return 0;
			}
			public int testSum(int[] data, MyArrayList myArrayList) {
				System.out.println();
				System.out.println();
				System.out.println("****Verifying Sum()****");
				int sum = myArrayList.sumArr(data);
				System.out.println("NOTE: Sum of array: "+ sum);
				System.out.println("Instruction 6: Delete 1 from the array");
				int[] newArr = myArrayList.removeAllOccurences(data);
				int sum_1 = myArrayList.sumArr(newArr);
				System.out.println("NOTE: sum of items after deleting 1 from arraylist is:  "+sum_1);
				if(sum == (sum_1+1))
					return 1;
				else 
					return -1;
				
			}
			public int testRemoveAllOccurences(int[] data, MyArrayList myArrayList) {
				System.out.println();
				System.out.println();
				System.out.println("***********Verifying RemovalAllOccurences**********");
				System.out.println("Instruction 7: INsert 20 ");
				data = myArrayList.insertSorted(data);
				System.out.println("Intruction 8:  Remove all 20s ");
				data = myArrayList.removeAllOccurences(data);
				int item =myArrayList.indexOf(data, 20);		
				System.out.println("NOTE: INdex position of 20");
				if(item == -1) {
					System.out.println(Arrays.toString(data));	
					return -1;
						
				}
				else
					return 1;
			}
			public int testIndexing(int[] data, MyArrayList myArrayList) {
				System.out.println();
				System.out.println();
				System.out.println("********Verifying Indexing*********");
				int index = myArrayList.indexOf(data, 20);
				System.out.println("NOTE: Index of 20 is:  "+index);
				System.out.println("Instruction 8: Insert 20");
				data = myArrayList.insertSorted(data);
				int index_1 = myArrayList.indexOf(data, 20);
				System.out.println("NOTE: INdex of 20 after insertion: "+index_1);
				if(index == index_1)
					return 1;
				else
					return 0;
			}
			
			
}
