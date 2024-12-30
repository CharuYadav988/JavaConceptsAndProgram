package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {
		
		String arr[]= {"hello","hii","Today","Week","Year"};
		List li=Arrays.asList(arr);
		
		System.out.println(li);
		
		
		
		
		String s1[]= {"Book","Look","Cook","Took","pool"};
		List<String> li2=new ArrayList<String>(Arrays.asList(s1));
		System.out.println(li2);
		
		li2.add("new");
		li2.add("element");
		System.out.println("After adding  the element ");
		System.out.println(li2);
		
		
		
		
	}

}
