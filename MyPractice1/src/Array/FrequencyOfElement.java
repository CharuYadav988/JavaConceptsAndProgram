package Array;

import java.util.Arrays;

public class FrequencyOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr[]= {1,2,4,5,1,2,3,4,5,1,2,3,4,5};
   Arrays.sort(arr);//{1,1,1,2,2,2,3,3,4,4,4,5,5,5}
   
   for(int i=0;i<arr.length;i++)
   {
	   int count =1;//it will count the number itself 
	   if(i!=arr.length-1)//if its last element we do not need to compare it with anyone	   
	   {
	   for (int j=i+1;j<arr.length;j++)
	   {
		   if(arr[i]==arr[j])
		   {
			   count++;
		   }
		   else
			   break;
	   }
	   }
   
	   System.out.println(arr[i]+"||"+count);
	   // for ex we have arr={1,1,1,2,2,3,3,3} so here once we got 1||3 so loop should start from
	   // 3 index so,count-1;3-1=2;i+=2;0+2
	   i+=count-1; 
   }
	}

}
