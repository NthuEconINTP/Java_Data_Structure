package grind75;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	 Map<String, HashMap<Integer, String>> outerMap = new HashMap<String, HashMap<Integer, String>>();
	//訊連第一題
	public static String LongestWord(String sen) {
		  
		sen = sen.replaceAll("[^a-z^A-Z]", " ");
		System.out.println(sen);
		List<String> strings = Arrays.asList(sen.split(" "));    
		String biggestWord = Collections.max(strings, Comparator.comparing(String::length));
		System.out.println(biggestWord);
		return biggestWord;
		
	}

		  public static void main (String[] args) {  
		    // keep this function call here     
		   String s="fun&!! time";
		    System.out.print(LongestWord(s)); 
}
}
