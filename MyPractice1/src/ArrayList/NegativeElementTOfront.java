package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class NegativeElementTOfront {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		ArrayList<Integer> arr1=new ArrayList<Integer>();
		ArrayList<Integer> arr2=new ArrayList<Integer>();
		arr.add(-1);
		arr.add(7);
		arr.add(-8);
		arr.add(0);
		arr.add(-5);
		arr.add(3);
		arr.add(-78);
		arr.add(99);
		System.out.println("Element before shifting "+arr);
		for(Integer x:arr)
		{
			if(x<0)
			{
				arr1.add(x);
				Collections.sort(arr1);//frm small to bigger numbers
				Collections.reverse(arr1);
			}
			else
			{
				arr2.add(x);
			}
		}
		arr1.addAll(arr2);
		System.out.println("Element after shifting "+arr1);
		
		
	}
	

}
