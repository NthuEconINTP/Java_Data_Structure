package sortingalgorithm;

import java.util.Arrays;

public class InsertionSort {
	// 大量右移，最後一次插入
	// 這個其實是shift 版本 其實也有swap 版本但效能比較差
	public static void  insertionSort(int[] arr) {
			
		for(int i=1;i<arr.length;i++) {
			int current =arr[i];  // 目前要插入的數字
			int j=i-1;            // 在他左邊的數字 
			while( j>=0 && arr[j]>current  ) { 
				arr[j+1]=arr[j];
				j--;
			}
			//當while結束時
			//j 左邊 <= current
			//j 右邊 > current
			System.out.println(j+1);
			arr[j+1]=current;
		}
		
	}
	// swap edition
	public static void insertionSortSwap(int[] arr) {

	    for (int i = 1; i < arr.length; i++) {

	        int j = i;

	        // 只要左邊比自己大
	        // 就一直交換
	        while (j > 0 && arr[j - 1] > arr[j]) {

	            // swap
	            int temp = arr[j];
	            arr[j] = arr[j - 1];
	            arr[j - 1] = temp;

	            j--;
	        }
	    }
	}
	
	public static void main(String[] args) {
		
		int[] array = { 5, 3,2,1,9,11,0 };
		insertionSort(array);
		System.out.println(Arrays.toString(array));
		
	}
}
