package MyFirstProject;


class A1
{
int id=56;
String chart;

}

class A2 extends A1
{
	int id =9;
	void display ()
	{
	System.out.println(id);
	System.out.println(super.id);//accessing the member from its immediate super class
	}
}

class mamal
{
	String colour="Red";
	}

class Animal extends mamal
{
	String colour="Black";
	}
class Dog extends Animal
{
	String colour="Yellow";
	void display() {
		System.out.println(super.colour);//here the super keyword will accesss the immediate super class mem 
	}
	}
public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A2 obj=new A2();
		obj.display();
		Dog obj2=new Dog();
		obj2.display();
		}

}
