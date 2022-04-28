package array;

public class FindNumberswithEvenNumberofDigits {
	
	
    public static int findNumbers(int[] nums) {
    	
    	int count=0;
    	
    	for(    int element : nums   ) {
    		
    		if(  element%2== 0 ) {
    			count++;
    		}
    		
    	}
    	
	    return count;
	    
    }
    
    
    public static int getNumbersDigits(int n) { //will return how many numbers of digits in that number
    	//if n=56666
//    	n=n/10;
//    	n=n/10;
//    	n=n/10;
//    	n=n/10;
    	int count=1;
    	
    	while( ( n=n/ 10) !=0 ) {
    		count++;
    		
    	}
    	
    	return count;
    	
    }
    
    
	public static void main(String[] args) {
		
		
		System.out.println(  getNumbersDigits(5666)    );
		
		
		int []	nums = {555,901,482,1771};
		
		System.out.println(   findNumbers(nums)       );
	}
	
	
}
