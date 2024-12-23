package StringBuffer;

public class StringBufferToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  StringBuffer s = new StringBuffer();
	      
          // Adding elements in StringBuffer
        s.append("Hello");
        s.append(" ");
        s.append("world");
        
          // String with the StringBuffer value
          String s1=s.toString();//you cannot use append in string 
        System.out.println(s1);
        StringBuffer s2 = new StringBuffer("JavaServices");
        
       s2.insert(1, "INSERT");
       System.out.println(s2);
        
    }
	}


