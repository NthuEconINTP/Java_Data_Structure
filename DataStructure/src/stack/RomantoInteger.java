package stack;

import java.util.HashMap;
import java.util.Map;

public class RomantoInteger {
	
    public static int romanToInt(String s) {
		
    	// make a hashMap to store the relation between Roman Character and Interger
    	Map<Character, Integer> RomanMap = new HashMap<>();
    	
    	RomanMap.put('I', 1);
    	RomanMap.put('V', 5);
    	RomanMap.put('X', 10);
    	RomanMap.put('L', 50);
    	RomanMap.put('C', 100);
    	RomanMap.put('D', 500);
    	RomanMap.put('M', 1000);
    	
        // the directly sum of the last Charater in String
    	System.out.println("length: " +s.length()  );
    	
    	int sum = RomanMap.get(s.charAt(s.length()-1));

    	System.out.println("the directly sum of the last Charater in String: "+  sum  );
    	// deal with two cases one is special cases like 'MC' 
    	for (int i=0; i<s.length()-1; i++) {
    		
    		if(RomanMap.get(s.charAt(i)) < RomanMap.get(s.charAt(i+1))) {
    			
    			sum = sum-RomanMap.get(s.charAt(i));
    			System.out.println("i in if: "+i+ " sum: "+sum);
    			
    		}
   
    		else {
    			sum = sum+RomanMap.get(s.charAt(i));
    		    System.out.println("i in else: "+i+ " sum: "+sum);
    		}
    	}
    	
    	return sum;
    	
    }

	public static void main(String[] args) {
		
		String s = "MCMXCIV";
		System.out.println(s);
		System.out.println(romanToInt(s));
	
	}
	
	
}
