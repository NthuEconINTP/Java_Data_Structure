package array;

import java.util.Arrays;

public class SortedSquares {
	
	 public static int[] sortedSquares(int[] nums) {
	
		    for( int i=0;i<nums.length;i++   ) {
		    	
		    	nums[i]=nums[i]*nums[i];
		    	System.out.println(nums[i]);
		    }
		    
		    Arrays.sort(nums);
		 	
	        return nums;
	        
	 }
	 
	 
	 public static void main(String[] args) {
		 	int []	nums = {555,901,482,1771};
			
			System.out.println(Arrays.toString(sortedSquares(nums))         );
		 
	 }
	 
}
