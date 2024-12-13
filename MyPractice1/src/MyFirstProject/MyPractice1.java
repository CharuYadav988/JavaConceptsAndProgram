package MyFirstProject;

public class MyPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(23<<8);//left shift operator
		System.out.println(36>>3);//right shift operator
		int a=90;
		int b=20;
		int c=30;
		
	if(a<b && b<c && c>a) //and operator
		{
			System.out.println("True");
		}
    else
		{
			System.out.println("false");
			
		}
	
	if( b<c || c<a) //or operator
	{
		System.out.println("True");
	}
else
	{
		System.out.println("false");
		
	}
	
	if(!(a<b && b<c && c>a)) //logical not
	{
		System.out.println("True");
	}
else
	{
		System.out.println("false");
		
	}
	int max = a>b ? (a>c?a:c) : (b>c?b:c);    //ternary operator
	System.out.println(max);
	}

}
