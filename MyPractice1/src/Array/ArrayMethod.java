package Array;

import java.util.Arrays;

public class ArrayMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5,6,7,8,9};
		int b[]= {1,2,3,4,5,6,7,9,9};
		int c[]= {89,9,77,98};
		//Arrays.compare(a,b) it will give output 0,1,-1
		System.out.println(Arrays.compare(a,b));
		//Arrays.equals(a,b) it will give output true or false
		System.out.println(Arrays.equals(a,b));
		//Arrays.toString(a) to print the array without for loop
		System.out.println(Arrays.toString(a));
		//Arrays.sort(c) it will sort the array in ascending order.
		Arrays.sort(c);
		for(int x:c)
		{
			System.out.println(x);
		}
		
	}

}
