package MyFirstProject;


class T1
{
	int a=10;//here we declare the var at globle level
	void display()//method name display
	
	{
		System.out.println("Hi");
		int b=a+10;//it can access the global var a with that var b is local var
		System.out.println(b);
	}
	
/*void display2()//method name display
	
	{
		System.out.println("Hi");
		int c=b+10;//it will try to access the local var b we will get error message 
		System.out.println(c);
	}*/
	
	void sum(int x,int y)
	
	{
		int sum = x+y;
		System.out.println(sum);
		
	}
	
int sum1(int x1,int y1)//using return type as int here 
	
	{
		int sum1 = x1+y1;
		System.out.println(sum1);
		return sum1;//using return statement
		
		
	}
	
	}
public class Variable {
	
	public static void main(String[] args) {
		T1 obj=new T1();//creating the object for class T1
		obj.display();//calling the class from object
		obj.sum(3, 3);
		System.out.println(obj.sum1(2, 2));
		
	}

}
