package ArrayList;

import java.util.ArrayList;

public class Move0ToFrontProgrm {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		ArrayList<Integer> arr1=new ArrayList<Integer>();
		ArrayList<Integer> arr2=new ArrayList<Integer>();
		arr.add(56);
		arr.add(0);
		arr.add(89);
		arr.add(0);
		arr.add(66);
		arr.add(0);
		arr.add(44);
		arr.add(0);
		arr.add(56);
		
		for(Integer x:arr)
		{
			if(x<=0)
			{
				arr1.add(x);//[0,0,0,0]
			}
			else {
				arr2.add(x);//[56,89,66,44,56]
			}
		}
		arr1.addAll(arr2);
		System.out.println(arr1);
		
		
	}

}
