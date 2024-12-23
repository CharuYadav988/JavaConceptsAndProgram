package String;

public class WhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{  
			  
			String str = "   ";  
			str=str.trim();
			System.out.println(str);
			int x =str.length();
			System.out.println(x);
			  
			if((str.trim()).length() > 0)  
			{  
			System.out.println("The string contains characters other than white spaces \n");  
			}  
			else  
			{  
			System.out.println("The string contains only white spaces \n");     
			}  
			  
		/*	str = "    ";  
			  
			if((str.trim()).length() > 0)  
			{  
			System.out.println("The string contains characters other than white spaces \n");  
			}  
			else  
			{  
			System.out.println("The string contains only white spaces \n");     
			}  
			  
	}*/
		}
		}
}


