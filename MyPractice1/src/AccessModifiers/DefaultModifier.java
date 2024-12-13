package AccessModifiers;

class acccess{
	//default access modifer can access within class ,within same package but not other package
	void display()
	{
		System.out.println("Default method");
	}
}
public class DefaultModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		acccess obj=new acccess();
		obj.display();

	}

}
