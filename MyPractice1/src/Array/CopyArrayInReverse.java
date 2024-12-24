package Array;

import java.util.Arrays;

public class CopyArrayInReverse {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int arr1[]=new int[arr.length];
		for(int i=0,j=arr.length-1;i<arr.length;i++,j--)
		{
			arr1[j]=arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
	}

}
