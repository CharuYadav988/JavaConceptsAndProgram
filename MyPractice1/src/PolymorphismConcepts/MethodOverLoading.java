package PolymorphismConcepts;

class shape{
	void circle() 
	{
		System.out.println("This is circle");
	}
	
	int circle(int x) 
	{
		int r=x*x;
		System.out.println("This is circle"+r);
		return r;
	}
}

class rectangle extends shape
{
	void display()
	{
		System.out.println("Result is ");
	}
}

public class MethodOverLoading {

	public static void main(String[] args) {
		rectangle r1=new rectangle();
		r1.circle(2);
		System.out.println("Result is ");

	}

}
