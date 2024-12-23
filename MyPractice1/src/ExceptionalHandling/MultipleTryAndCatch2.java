package ExceptionalHandling;

public class MultipleTryAndCatch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hiearchy of exception not maintained
		//already the one exception we declare at line 13 
		 try{    
			    int a[]=new int[5];    
			    a[5]=30/0;    
			   }    
			   catch(Exception e){System.out.println("common task completed");}    
			   catch(ArithmeticException e){System.out.println("task1 is completed");}    
			   catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}    
			   System.out.println("rest of the code...");    
			 }    
	}

}
