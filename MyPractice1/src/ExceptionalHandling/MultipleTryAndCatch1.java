package ExceptionalHandling;

public class MultipleTryAndCatch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Here we didnt mention the exception as NullPointerException
		// so it will invoked the parent class exception.
		 try{    
             String s=null;  
             System.out.println(s.length());  
            }    
            catch(ArithmeticException e)  
               {  
                System.out.println("Arithmetic Exception occurs");  
               }    
            catch(ArrayIndexOutOfBoundsException e)  
               {  
                System.out.println("ArrayIndexOutOfBounds Exception occurs");  
               }    
            catch(Exception e)  
               {  
                System.out.println("Parent Exception occurs");  
               }             
            System.out.println("rest of the code");    
 }  
	}


