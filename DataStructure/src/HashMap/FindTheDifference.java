package HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindTheDifference {
	
	public static char findTheDifference(String s, String t) {
		char result=' ';
		HashMap myHashMap=new HashMap<Character, Character>();
		Set<Character> store = new HashSet<>();
		char[] sarray = s.toCharArray();
		char[] tarray = t.toCharArray();
		for (int i=0;i<sarray.length;i++) {
			myHashMap.put(sarray[i], sarray);
		}
		
//		for (  Map.Entry<Character, Character>  entry :myHashMap.entrySet() ) {
//		
//		}
		
		for (int i=0;i<tarray.length;i++) {
			if(!myHashMap.containsKey(tarray[i])) {
//				System.out.println(tarray[i]);
				result=tarray[i];
			};
		}
		if(result==' ') {
			for (char name : tarray){ 
				if (store.add(name) == false){ 
					result=name; 
				} 
			}
		}
		return result;  
	}
	
	public static void main(String[] args) {
		
		String s="mike";
		String t="mikeg";
		
		char answer=findTheDifference(s, t);
		System.out.println(answer);
}
}