package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC0027RemoveElement {
		
	 public static int removeElement(int[] nums, int val) {
	       
		 List<Integer> intList = new ArrayList<Integer>(nums.length);
		 
		 int count=0;
		 int length=nums.length;
		 for (int i : nums){
		     
			if(i==val) {
				count++;
			}
			 
		 }
		 System.out.println("length: "+nums.length);
		 System.out.println("count: "+count);
		 
		 for (int i : nums){
		     
			 intList.add(i);
			 
		 }
		 System.out.println("size: " + intList.size()  );
		 intList.removeAll(Arrays.asList(val));
		 
		 nums =  intList.stream().mapToInt(i -> i).toArray();

		 System.out.println("after remove size: " + intList.size()  );
		 
//		 nums= new int[ intList.size()  ];
		 
//		 for(int i=0;i< intList.size();i++) {
//			 
//			 nums[i]=intList.get(i);
//			 
//		 }
		 
		 System.out.println("nums in function:"+ Arrays.toString(nums)      );
		 return length-count;
		 
	 }
		
	 public static int removeElement2(int[] nums, int val) {
		 
		 int retunrnVal = 0;
	        if(null != nums && nums.length >0){
	            for(int i = 0;i<nums.length;i++){
	                if(nums[i] != val){                    //如果為非需移除值
	                    nums[retunrnVal] = nums[i];        //佔用該List內的位置
	                    retunrnVal++;                      //同時紀錄長度    
	                }
	            }
	        }
	        System.out.println("print nums in function"+ Arrays.toString(nums) );
	        return retunrnVal;
		 
	 }
	 public static void main(String[] args) {
		 	
		 
		 int [] nums= { 3,2,2,3  };
		 
		 int val=3;
		 
		 int answer;
		 
		 answer=removeElement2(nums ,val);
		 
		 System.out.println(answer);
		 
		 System.out.println("print nums in main "+ Arrays.toString(nums));

	 }
	
}
