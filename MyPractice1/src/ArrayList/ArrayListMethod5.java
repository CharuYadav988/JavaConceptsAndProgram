package ArrayList;

import java.util.ArrayList;

public class ArrayListMethod5 {

	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<String>();
        arr.add("Kite");
        arr.add("Night");
        arr.add("Site");
        arr.add("White");
        arr.add("Lite");
        arr.add("rite");
        
        arr.remove(2);
        for(String s:arr)
        {
        	System.out.println(s);
        }
        ArrayList<String> arr1=new ArrayList<String>();
        arr1.add("Kite");
        arr1.add("Night");
        arr1.add("Site");
        arr1.add("White");
        arr1.add("Lite");
        
       boolean flag= arr.containsAll(arr1);//All element of arr1 should be in arr then its TRUE
       System.out.println(flag);
	}

}
