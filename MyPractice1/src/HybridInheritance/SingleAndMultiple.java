package HybridInheritance;

interface mango
{
	void show();
}

interface apple
{
	void show();
}

class fruits
{
	void display()
	{
		System.out.println("Fruits basket");
		
	}
	}
class food extends fruits implements mango,apple
{
	public void show()
	{
		System.out.println("This is how hybrid works");
		
	}
	}


public class SingleAndMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		food obj=new food();
		obj.show();
		obj.display();

	}

}
