package array;

public class MaxConsecutiveOnes {
	 
	 
	 public static int findMaxConsecutiveOnes(int[] nums) {
		
		 int count=0;

		 int result=0;
		 
		 for(int i=0;i<nums.length;i++) {
			 
			
			 if(nums[i]==1) {
				 
				 count++;
				 
				 result=Math.max(result, count);
				 
			 }else {
				 count=0; // �k�s��U�@��index���O1���ɭ�
			 }
			 
		 }
		 
		 return result;
		 
	 }
	 
	 
	 public static void main(String[] args) {
	 	  
		 int[] nums = {1,0,1,1,0,1};
		 
		 int answer = findMaxConsecutiveOnes(nums);
		 System.out.println(answer);
		 
		 
	 }
	 
	 
}
