package JavaAssignments;

public class Assignment11 {

	public static void main(String[] args) {
		String s1="  abcDEF@1234cfghi   ";
		
		
        s1=s1.trim();  //Remove all white spaces	
		System.out.println("String after removing spaces- "+s1);

		boolean flag= s1.contains("a");  // It will check it string having 'a' in it.
		System.out.println("Whether string contain 'a' in it or Not- "+flag);
		
		int x=s1.indexOf("a");          // It will check the index of 'a' in it.
		System.out.println("Index of given character is "+x);
		  
	    s1=	s1.toUpperCase();   //Convert to UpperCase
	    System.out.println("String to Uppercase-  "+s1);
	   
	    s1=	s1.toLowerCase();   //Convert to LowerCase
	    System.out.println("String to LowerCase -  "+s1);
	   
	    String s2[]=s1.split("@"); //it will split the string to array on basis on @
	    System.out.println("After the splitting the string on basis of @ - "+s1);
	    for(String s:s2)
	    {
	    	
		   System.out.println(s);
	    }
	   
	  
	}

}
