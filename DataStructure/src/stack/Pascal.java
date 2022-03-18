package stack;

import java.util.ArrayList;
import java.util.List;


public class Pascal {

	// we use this n ! / ( n ¡V r ) ! r !
	// 0C0
	// 1C0 1C1
//2C0   2C1   2C2
	// 3C0 3C1 3C2 3C3
	public static List<List<Long>> generate(int numRows) {

		List<List<Long>> AnswerList = new ArrayList<List<Long>>();
		 // temp for prev row
		int n = numRows-1;
		int i;
		int j;

		for (i = 0; i <= n; i++) {
			for (j = 0; j <= n - i; j++) {

//				 for left spacing
				System.out.print(" ");
//				System.out.print("J "+j);
			}
			List<Long> tempList = new ArrayList<Long>();
			for (j = 0; j <= i; j++) {
				
				long number = factorial(i) / ( factorial(i - j) * factorial(j) );
//				System.out.println("i: "+ i+" j: "+j+" number: " +number  );
				
//				System.out.println(number);
				tempList.add(number);
				// nCr formula
				System.out.print(" " + factorial(i) / (factorial(i - j) * factorial(j)));
			}
//			System.out.println(tempList);
			 System.out.println();
			 AnswerList.add(tempList);
			 
		}
		return AnswerList;

	}

	public static long  factorial(int i) {
		if (i == 0)
			return 1;
		return i * factorial(i - 1);
	}

	public static void main(String[] args) {
//
//		System.out.println(factorial(13));
//		System.out.println(factorial(12));
//		System.out.println(factorial(2));
//		int i=13;
//		int j=1;
//		Long number = factorial(i) / ( factorial(i - j) * factorial(j) );
//		System.out.println(number);
//		int a=	1932053504/479001600;
//		System.out.println(a);
		
//		System.out.println(math.factorial(13));
		List<List<Long>> AnswerList=generate(16);
		System.out.println(AnswerList.toString());
		
	}

}
