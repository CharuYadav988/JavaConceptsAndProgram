package ExceptionalHandling;

public class TryAndException {

	public static void main(String[] args) {
		
		try {
		int a=9/0;//it will throws ArithmeticException without try and catch.
		System.out.println(a);
		}
		catch(Exception e)
		{
			System.out.println("Catch the exception "+e);
		}
		
		
		try {
			int a[]= {1,2,3,4};//it will throws Array out of bound exception without try and catch.
			System.out.println(a[5]);
			}
			catch(Exception e)
			{
				System.out.println("Catch the exception "+e);
			}
		
		try {
			String s=null;//it will throws NullPointerException without try and catch.
			int l=s.length();
			System.out.println(l);
			}
			catch(Exception e)
			{
				System.out.println("Catch the exception "+e);
			}
		
		
		try {
			String str="abcde";//it will throws NumberFormatException without try and catch.
			int d=Integer.parseInt(str);
			System.out.println(d);
			}
			catch(Exception e)
			{
				System.out.println("Catch the exception "+e);
			}
		
		
		// Try and Catch 
		int b=90;
		int c=89;
		int d=b+c;
		System.out.println(d);//its a happy code but will not run as line 7,8 throws exception
		
		// we can use one try and multiple catch block as well.

	}

}
