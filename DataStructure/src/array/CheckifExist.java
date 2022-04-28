package array;

import java.util.HashSet;
import java.util.Set;

public class CheckifExist {
	 
	
	public static boolean checkIfExist(int[] arr) {
	        
		Set<Integer> s = new HashSet<>();
	        
		for( int i:arr){
			s.add(i);
			
	    }
		for( int i:arr){

			if(s.contains(i*2) ){//|| (s.contains(i/2) && i%2==0)
	                
				return true;
	        }
	        
	    }
	        return false;
	    }
	 public static void main(String[] args) {
		
	    int [ ] arr= { 7,1,14,11     };
		
		 System.out.println(  checkIfExist(arr)   );
	
		System.out.println(arr);
	 }
}
