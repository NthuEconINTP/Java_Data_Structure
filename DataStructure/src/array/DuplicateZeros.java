package array;

public class DuplicateZeros {
	
	
	 public static void duplicateZeros(int[] arr) {
		 
		 
		 
	 }
	 
	 public static void main(String[] args) {
		 	
		  int [ ] arr= {1,0,2,3,0,4,5,0    };
		  
		  int [ ] arr2= { 1,2,3     };
		  
		  int countZeros=0;
		  
		  for(int i=0;i<arr.length;i++) {
			  
			  if(arr[i]==0 ) {
				  countZeros++;
			  }
			  
		  }
		  
		  
		 System.out.println("countZeros: "+countZeros);
		  
		 
	 }
	 
	 
}
