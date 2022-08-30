package array;

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {
	
	 public static int removeDuplicates(int[] nums) {
		
		 
		 
		 return 0;
	 }
	
	
	 public static void main(String[] args) {
		 
		 
		 int [] nums = { 0,0,1,1,1,2,2,3,3,4   };
		 
		 System.out.println(nums.length);

		 int duplicateElementValue;
		 int count=0;
		 
		 for(int i=0;i<nums.length;i++) {
			 
			 
			 if( i < nums.length-1  && nums[i]==nums[i+1] ) { //deal boundary condition
				 
				 duplicateElementValue=nums[i];
				 
				 System.out.println("duplicateElementValue: "+  duplicateElementValue  );
				 
//				 for (int j = i; j < length; j++) {
//					    // Shift each element one position to the left
//					 nums[j - 1] = nums[j];
//				 }
//				 
//				 length--;
				
				 count++;
			 }
			 
		 }
		 
		 int [ ] recordDuplicateIndex=new int [count];
		 
		 for(int i=0;i<count;i++) {
			 
			 int index = 0;
			 
			 if( i < nums.length-1  && nums[i]==nums[i+1] ) { //deal boundary condition
				 index=i;
				 System.out.println(index);
			 }
			 
			 recordDuplicateIndex[i]= index;
		 }
		 
		 
		 
		 System.out.println("count: "+count);
		 
		 System.out.println(Arrays.toString(nums));
		 System.out.println(Arrays.toString(recordDuplicateIndex));
	 }// end for main
	 
	 
}
