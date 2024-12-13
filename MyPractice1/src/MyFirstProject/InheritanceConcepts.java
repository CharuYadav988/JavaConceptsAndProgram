package MyFirstProject;

//Single inheritance where we had one parent class and one child class

/*class Parent
{
	void test()
	{
		System.out.println("Single Inheritance");
		System.out.println("Parent Class or Super Class");
	}
}	
class child extends Parent  //A2 is child class while A1 is parent class
{
	void tester()
	{
		System.out.println("Child Class or Sub Class");
	}
	}*/

// Multilevel inheritance

/*class GrandParent
{
	void test1()
	{
		System.out.println("Multilevel Inheritance");
		System.out.println("Grandparent class");
	}
}	
class parent extends GrandParent  
{
	void test2()
	{
		System.out.println("Parent class");
	}
	}
class child1 extends parent  
{
	void test3()
	{
		System.out.println("Child class");
	}
	}*/

//hierarchical Inheritance

class Parent1
{
	void test1()
	{
		System.out.println("Hierarchical Inheritance");
		System.out.println("parent class");
	}
}	
class child3 extends Parent1  
{
	void test2()
	{
		System.out.println("child1 class");
	}
	}
class child4 extends Parent1  
{
	void test3()
	{
		System.out.println("child2 class");
	}
	}
	
public class InheritanceConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*child obj=new child();//object of child class can also invoked the parent class
		obj.test();
		obj.tester();
		//multilevel inheritance
		child1 obj2=new child1();
		obj2.test1();
		obj2.test2();
		obj2.test3();*/
		// Hierarchical Inheritance
		
		child3 obj=new child3();
		obj.test2();
		obj.test1();
		child4 obj2=new child4();
		obj2.test3();
		obj2.test1();
		
		

	}

}
