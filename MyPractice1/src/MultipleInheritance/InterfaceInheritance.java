package MultipleInheritance;

interface InterfaceInheritance {
void d1();

}

interface InterfaceInheritance1 extends InterfaceInheritance
{
	void d2();
	}
class c1 implements InterfaceInheritance1
{
	public void d1()
	
       {
		System.out.println("helloo");
		}
	public void d2()
	
    {
		System.out.println("Hi");
		}
}