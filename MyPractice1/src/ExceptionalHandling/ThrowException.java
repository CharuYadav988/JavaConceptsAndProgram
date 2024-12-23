package ExceptionalHandling;

public class ThrowException {
	
	public static void Voting(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException ("Invalid Age");
		}
		else 
		{
		System.out.println("Valid Age")	;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowException.Voting(67);
	}

}
