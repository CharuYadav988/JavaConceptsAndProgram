package Array;

import java.util.Arrays;

public class ArrayCopy {
	
	

public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
			
		}
		
		System.out.println(Arrays.toString(b));
		for(int x:b) {
			System.out.println(x);
		}
	}

}
