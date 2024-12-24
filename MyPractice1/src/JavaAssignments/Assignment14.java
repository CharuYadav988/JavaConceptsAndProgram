package JavaAssignments;


class School1
{
	String Name="Kendriye Vidyalaya,Sukna";
	
	School1()
	{
		System.out.println("The Name of School is "+Name);
	}
	
	void Display()
	{
		System.out.println(Name+"- This school is based out of Kolkata");
	}
	}
public class Assignment14 {

	public static void main(String[] args) {
		School1 obj=new School1();
		obj.Display();

	}

}
