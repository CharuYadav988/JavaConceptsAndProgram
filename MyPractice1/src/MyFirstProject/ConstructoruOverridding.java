package MyFirstProject;
class Bike{  
	  final void run(){System.out.println("running...");}  
	}  
	class Honda2 extends Bike{  
	 void display()
	 {System.out.println("walking...");}
	 
	}

public class ConstructoruOverridding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda2 obj=new Honda2();
		obj.run();
		//Bike b1=new Bike();
		//b1.run();
	}

}
