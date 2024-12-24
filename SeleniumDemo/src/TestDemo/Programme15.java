package TestDemo;

class school    //class name school
{
	String Name;
	String Address;
	int Strength;
	
	school(String N,String A)    //constructor1 with 2 parameters
	{
		Name=N;
		Address=A;
	}
	school(String N,String A,int S)   //constructor2 with 3 parameters
	{
		Name=N;
		Address=A;
		Strength=S;
	}
	
	void Display()             //Method to display the values
	{
		System.out.println(Name+" "+Address+" "+Strength);
	}
}
public class Programme15 {

	public static void main(String[] args) {
		school obj=new school("Charu","Delhi,India"); //Object creation
		school obj1=new school("Charu","Delhi,India",45);
		obj.Display();  //Calling the method
		obj1.Display();
		

	}

}
