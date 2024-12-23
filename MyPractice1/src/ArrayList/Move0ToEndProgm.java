package ArrayList;

import java.util.ArrayList;

public class Move0ToEndProgm {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		ArrayList<Integer> arr1=new ArrayList<Integer>();
		ArrayList<Integer> arr2=new ArrayList<Integer>();
		arr.add(89);
		arr.add(0);
		arr.add(87);
		arr.add(0);
		arr.add(78);
		arr.add(9);
		arr.add(0);
		arr.add(3);
		
		for(Integer x:arr)
		{
			if(x>0)
			{
				arr1.add(x);//output [89,87,78,9,3]
			}
			else
			{
				arr2.add(x);//[0,0,0]
			}
		}
		
		arr1.addAll(arr2);
		System.out.println(arr2);
		
	}

}
