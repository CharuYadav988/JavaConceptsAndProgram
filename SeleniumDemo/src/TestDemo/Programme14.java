package TestDemo;


class School1
{
	String Name="Kendriye Vidyalaya";
	
	School1()
	{
		System.out.println("The Name of School is "+Name);
	}
	
	void Display()
	{
		System.out.println(Name+"- This school is based out of Kolkata");
	}
	}
public class Programme14 {

	public static void main(String[] args) {
		School1 obj=new School1();
		obj.Display();

	}

}
