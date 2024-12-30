package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfWords {

	public static void main(String[] args) {
		String s="Tip Tap Toe Tip Tap Tip";
		String s1[]=s.split(" ");
		
		Map<String,Integer> mp=new LinkedHashMap<String,Integer>();
		for(String x:s1)
		{
			if(mp.containsKey(x))
			{
				mp.put(x,(mp.get(x)+1));
			}
			else
			{
				mp.put(x,1);
			}
		}
		for(Map.Entry z:mp.entrySet())
		{
			System.out.print(z.getKey()+" ");
			System.out.println(z.getValue());
		}
		
		//Maximum Frequency
		
		int maxFrequency=0;
		String MaxOccurred="";
		
		for(Map.Entry<String,Integer> z:mp.entrySet())
		{
			if(z.getValue()>maxFrequency)
			{
				maxFrequency=z.getValue();
				MaxOccurred=z.getKey();
			}
		}
        System.out.println("Maximum occured String is "+MaxOccurred+" "+"with frequency "+maxFrequency);
        
      //Minimum Frequency
		
      		int minFrequency=100;
      		String MinOccurred="";
      		
      		for(Map.Entry<String,Integer> z:mp.entrySet())
      		{
      			if(z.getValue()<minFrequency)
      			{
      				minFrequency=z.getValue();
      				MinOccurred=z.getKey();
      			}
      		}
              System.out.println("Minimum occured String is "+MinOccurred+" "+"with frequency "+minFrequency);
	}

}
