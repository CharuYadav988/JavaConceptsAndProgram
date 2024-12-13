package MyFirstProject;

public class StaticKeyword {

	/*   int id;
	String Name;
	static String company="TCS"; //static variable
	float salary;
	
	StaticKeyword(int i,String s){
		id=i;
		Name=s;
		}
	
	StaticKeyword(int i,String s,float s2){
		id=i;
		Name=s;
		salary= s2;
		}
	*/
	
	static void display() //static method
	{
	//	System.out.println(id+" "+Name+"  "+company+" "+salary);
		System.out.println("HIII");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	StaticKeyword obj=new StaticKeyword(123,"Mahak");//invoking the constructor
		obj.display();
		
		StaticKeyword obj2=new StaticKeyword(23,"Maak");//invoking the constructor
		obj2.display();   */
		
		StaticKeyword.display();//directly calling bcz of static
	}

}
