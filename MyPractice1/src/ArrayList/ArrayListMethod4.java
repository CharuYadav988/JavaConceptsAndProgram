package ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListMethod4 {

	public static void main(String[] args) {
		ArrayList<Integer> arr4=new ArrayList<Integer>();
		//to add elements in arraylist
		arr4.add(89);
		arr4.add(999);
		arr4.add(8109);
		arr4.add(999);
		arr4.add(89);
		
		int x=arr4.lastIndexOf(999);//if any element occurs twice it will give the last index of that
		System.out.println(x);
		
		//to clone the array list
		
		ArrayList<Integer> clonelist=(ArrayList<Integer>) arr4.clone();
		System.out.println(clonelist);
		clonelist.removeAll(clonelist);
		System.out.println(clonelist);//removeall- list will give tht chance to add new element in list
		
		System.out.println("Iterate through list iterator");
		ListIterator<Integer> li=arr4.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		System.out.println("Iterate through backwards list iterator");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
	}

}
