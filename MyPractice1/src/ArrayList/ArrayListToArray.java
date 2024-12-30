package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<String>();
        arr.add("Kite");
        arr.add("Night");
        arr.add("Site");
        arr.add("White");
        arr.add("Lite");
        arr.add("rite");
        arr.replaceAll(i ->i.toUpperCase());//to convert to uppercase
		
		String a[]=new String[arr.size()];
		arr.toArray(a);
		for(String s:arr)
		{
			System.out.println(s);
		}
		
		ArrayList<Integer> arr2=new ArrayList<Integer>();
		arr2.add(-1);
		arr2.add(7);
		arr2.add(-8);
		arr2.add(0);
		arr2.add(-5);
		arr2.add(3);
		arr2.add(-78);
		arr2.add(99);

		Object i[]=new Object[arr2.size()];
		arr2.toArray(i);
		for(Object o:arr2)
		{
			System.out.println(o);
			
		}
	}

}
