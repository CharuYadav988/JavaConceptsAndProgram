package JavaAssignments;

import java.util.Arrays;

public class Assignment12 {

	public static void main(String[] args) {
		int arr[]= {2,3,4,2};
		int j=0;
		Arrays.sort(arr); //{2,2,3,4}
		
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
