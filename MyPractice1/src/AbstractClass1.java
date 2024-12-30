
abstract class shape
{
	
	int y; //No need to initialize on spot.
	
	shape()     //CONSTRUCTOR
	{
		System.out.println("constructor we can declare under abstract class with definition");
	}
	
static void newk()     //Static Method  with definition
{
	System.out.println("static method we can declare under abstract class with definition");
}


	abstract void circle();  //Declaration no Definition
	abstract void rectangle();
}

 class c1 extends shape
 {
	 void circle() {
		 System.out.println("circle");
	 }
	 
	 void rectangle() {
		 System.out.println("Recangle");
	 }
 }
 
 

public class AbstractClass1 {

	public static void main(String[] args) {
		shape s = new c1();
		shape.newk();
		s.circle();
		s.rectangle();

	}

}
