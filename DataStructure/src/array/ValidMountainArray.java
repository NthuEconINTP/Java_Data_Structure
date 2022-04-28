package array;

public class ValidMountainArray {
	
	 public static boolean validMountainArray(int[] arr) {
//		 if (arr.length < 3) return false;
		 
		 int leftindex=0;
		 
		 int rightindex=arr.length-1;
		 int rightindex2=arr.length-1;
		 //if length=7 i+1 must <7 
		 int i=0;
		 while( i+1<arr.length  && arr[i]<arr[i+1]    ) {
			 
			 leftindex=i+1;
			 i++;
		 }
		 
		 System.out.println("leftindex: "  +leftindex     );	
		 
		 while( arr[rightindex] <arr[rightindex-1] &&   rightindex-1>0            ) {
			 
			 rightindex2= rightindex-1;
			 rightindex--;
			
		 }
		 System.out.println( "rightindex: "+rightindex       );
		 
		 
		 if(   leftindex==0 ||    rightindex2==arr.length-1            ) {
			 return false;
		 }
		 
		 return  leftindex ==  rightindex;
		 
	 }
	 
	 
	 public static void main(String[] args) {
		 
		  int [ ] arr= { 1,2,3,2};//0,3,2,1       7,1,14,11  
		  
		  boolean answer=validMountainArray(arr);
		  
		  System.out.println(answer);
		  
	}
	 
	 
}
