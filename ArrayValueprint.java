package array;

import java.util.Arrays;
import java.util.Collections;

public class ArrayValueprint {
	public static void main(String[] args) {
		Integer a[]  = {10,20,30,40,10};
		
		//to print array value
		System.out.println("print array values:" +"\n" + Arrays.toString(a));
		//sort in ascending order 
		Arrays.sort(a);
		System.out.println("after sorting:" + Arrays.toString(a));
		//sort in descending order
		 Arrays.sort(a,Collections.reverseOrder());
		 System.out.println("decending order:" + Arrays.toString(a));
	}
}
