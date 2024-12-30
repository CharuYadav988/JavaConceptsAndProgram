package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfElements {

	public static void main(String[] args) {
		int a[]= {11,12,13,11,12,11,12,12};
		int x=a.length;
		
		Map<Integer,Integer> mp=new LinkedHashMap<Integer,Integer>();
		
		for(int i=0;i<x;i++)
		{
			if(mp.containsKey(a[i]))
			{
				mp.put(a[i],(mp.get(a[i])+1));
			}
			
			else
			{
				mp.put(a[i], 1);
			}
		}
		 for(Map.Entry f:mp.entrySet())
		 {
			 System.out.print(f.getKey()+" ");
			 System.out.println(f.getValue());
		 }
		 //To find the element having maximum frequency
		int maxFrequency=0;
		int maxOccurrenceValue=0;
		
		for(Map.Entry<Integer,Integer> f:mp.entrySet())
		{
			if(f.getValue()>maxFrequency)
			{
				maxFrequency=f.getValue();
				maxOccurrenceValue=f.getKey();
			}
		}
		System.out.println("Most occured Key is "+maxOccurrenceValue+" "+" holding the ocuurence value "+maxFrequency);

		//To find the element having Minimum frequency
		int minFrequency=100;
		int minOccurrenceValue=0;
		
		for(Map.Entry<Integer,Integer> f:mp.entrySet())
		{
			if(f.getValue()<minFrequency)
			{
				minFrequency=f.getValue();
				minOccurrenceValue=f.getKey();
			}
		}
		System.out.println("Most occured Key is "+minOccurrenceValue+" "+" holding the ocuurence value "+minFrequency);
	}

}
