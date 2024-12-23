package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMethod {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		//to add elements in arraylist
		arr.add(89);
		arr.add(99);
		arr.add(8109);
		arr.add(999);
		System.out.println("Iterate through Array List using simple for loop");
		//To iterate through arraylist
		//simple for loop--we do not use this because get() consumes memory
		for(int i=0;i<arr.size();i++)
		{
			System.out.println(arr.get(i));
		}
		System.out.println("Iterate through Array List using  for each loop");
		//for - each loop
		for(Integer a:arr)
		{
			System.out.println(a);
		}
		System.out.println("Iterate through Array List using  iterator");
		
		Iterator itr=arr.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
