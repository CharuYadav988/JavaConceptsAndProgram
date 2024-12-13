package MultipleInheritance;

public class classc1 implements Interface1,interface2
{
	public void m1()
	{
		System.out.println(y);
	}
	public void m2()
	{
		System.out.println(x);
	}

	public static void main(String[] args) {
		classc1 obj=new classc1();
		obj.m1();
		obj.m2();
		Interface1.s1();//will have to directly call from interface1 this is static
		
	}
}
