package sortingalgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

	public static int[] mergeSort(int[] unsortedarray) {

		int n = unsortedarray.length;
		System.out.println("unsortedarray length: "+ n);
		// if lengh =1 dont need to sort
		if (n == 1) {
			return unsortedarray;
		}
		
		int[] arrayOne = Arrays.copyOfRange(unsortedarray, 0, n / 2);
		int[] arrayTwo = Arrays.copyOfRange(unsortedarray, n / 2, n);

//		System.out.println(Arrays.toString(arrayOne));
//		System.out.println(Arrays.toString(arrayTwo));

		arrayOne = mergeSort(arrayOne);
		arrayTwo = mergeSort(arrayTwo);

		return merge(arrayOne, arrayTwo);

	}

	public static int[] merge(int[] arrayLeft, int[] arrayRight) {

		int[]   tempArray=new int[0];
		
		
		while (arrayLeft.length!=0 & arrayRight.length!=0) {

			if (arrayLeft[0] > arrayRight[0]) {

				tempArray=append(tempArray,arrayRight[0]);
				arrayRight=removeFirstElement(arrayRight);
		
			} else {
				
				tempArray=append(tempArray,arrayLeft[0]);
				arrayLeft=removeFirstElement(arrayLeft);

			}

		}
		
		while( arrayLeft.length!=0 ) {
			tempArray=append(tempArray,arrayLeft[0]);
			arrayLeft=removeFirstElement(arrayLeft);
			
		}
		
		while(arrayRight .length!=0) {
			tempArray=append(tempArray,arrayRight[0]);
			arrayRight=removeFirstElement(arrayRight);
		}
		
		
		return tempArray;

	}

	public static int[] removeFirstElement(int[] arr) {
		int newArr[] = new int[arr.length - 1];
		for (int i = 1; i < arr.length; i++) {
			newArr[i - 1] = arr[i];
		}
		return newArr;
	}

	public static int[] append(int[] array, int value) {
		int[] result = Arrays.copyOf(array, array.length + 1);
		result[result.length - 1] = value;
		return result;
	}

	public static void main(String[] args) {
		int[] array = { 3, 5,2,1,9,11,0 };

		array=    mergeSort(array);
		System.out.println(Arrays.toString(array));
	}

}
