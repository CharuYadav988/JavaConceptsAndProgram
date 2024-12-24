package Array;

import java.util.Arrays;

public class RemoveDuplicatesfromArray {

	public static void main(String[] args) {
		int arr[]= {3,4,5,6,3,4,5,6,9};
		int j=0;
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length-1;i++)
		{
				if(arr[i]!=arr[i+1])
				{
					arr[j++]=arr[i];
				}
			
		}
		arr[j++]=arr[arr.length-1];
		for(int k=0;k<j;k++)
		{
			System.out.println(arr[k]);
			}
	}

}
