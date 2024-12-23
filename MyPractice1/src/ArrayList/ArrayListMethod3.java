package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethod3 {

	public static void main(String[] args) {
		//Merging two Arraylist
		ArrayList<String> arr1=new ArrayList<String>();
		arr1.add("Hi");
		arr1.add("Hmm");
		arr1.add("Nothing");
		arr1.add("Bye");
		arr1.add("Bro");
		
		ArrayList<String> arr2=new ArrayList<String>();
		arr2.add("Bro");
		arr2.add("Sis");
		arr2.add("Cousin");
		arr2.add("Neighbour");
		arr1.addAll(arr2);
		System.out.println(arr1);//All the elements will be in arr1 arraylist arr2 will be same
		
		arr1.retainAll(arr2);
		System.out.println(arr1);//common element from both list will print then element from arr2
		
		boolean flag=arr1.contains("Sis");//if the element present or not
		System.out.println(flag);
		
		Collections.sort(arr1);
		System.out.println("After Sorting "+arr1);//Sort the array in alphabetical order
		
		Collections.reverse(arr1);//Reverse the list
		System.out.println("After reversing "+arr1);
		
		Collections.shuffle(arr1);//in any order it will shuffle
		System.out.println("After Shufflng "+arr1);
	}

}
