package JavaAssignments;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment4 {

	public static void main(String[] args) {
		int arr[]= {2,2,5,1,1,2,6};
		Arrays.sort(arr);
		
		Map<Integer,Integer> mp=new LinkedHashMap<Integer,Integer>();
		
		for(Integer i:arr)
		{
			if(mp.containsKey(i))
			{
				mp.put(i, (mp.get(i)+1));
			}
			else
			{
				mp.put(i, 1);
			}
			
	}
		for(Map.Entry z:mp.entrySet())
		{
			System.out.print(z.getKey()+" ");
			System.out.println(z.getValue());
		}
		
		for(Map.Entry<Integer,Integer> z:mp.entrySet())
		{
			if(z.getValue()==1)
			{
				System.out.print("Element occured once "+z.getKey()+" ");
				
			}
			
			System.out.println();
		}
		
		

	}

}
