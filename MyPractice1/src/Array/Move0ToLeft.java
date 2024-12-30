package Array;

public class Move0ToLeft {

	public static void main(String[] args) {
		int arr[]= {8,0,9,0,4,0};
		int len=arr.length-1;
		int j=0;
		
		for(int i=0;i<arr.length;i++)//
		{
			if(arr[i]!=0)
			{
				arr[j--]=arr[i];
			}
		}
		 while(j<arr.length);
		 
		 {
			 arr[j--]=0;
		 }
		 
		 for(int k=0;k<j;k++)
		 {
			 System.out.println(arr[k]);
		 }
	}

}
