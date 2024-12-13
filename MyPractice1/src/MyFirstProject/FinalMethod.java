package MyFirstProject;

 class A{  //if we use Final here line 9 will thorw error
	 void display()//if we use Final here line 10 will thorw error
	{
		System.out.println("helooo");
	}
}
 class b extends A{//it will throw error as final class can not be inherit
	 void display() //it will throw error as final method can not be overridden
	
		{
			System.out.println("heloouio");//method overridden 
		}
 }
public class FinalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
