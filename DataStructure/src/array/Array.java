package array;
import java.util.ArrayList;
import java.util.Arrays;
public class Array {
	public static void main(String[] args) {
		int myarray[]=new int [5];//�ŧi�ɵ��w�Ŷ��j�p
		int[] score = new int[] {90, 85, 55, 94, 77};//�ŧi�ɪ�������
		int[] score2= {2,3};
		
		System.out.println(myarray);
		System.out.println(myarray.toString()       );
		System.out.println(Arrays.toString(score));
		 System.out.println("123");
		ArrayList<Integer> arrL = new ArrayList<Integer>(2);
		arrL.add(1); 
        arrL.add(2); 
        System.out.println(arrL);
//     System.out.println(arrL.toString());
	}
	
}
