package MyFirstProject;

class t1{
	int id;
	char s;
	boolean ease;
	
	t1(){
		System.out.println("Hi");/* this statement will execute first as its a default constructor*/
		}
	 t1 (int i,char a,boolean f)
	 {
		 id=i;
		 s=a;
		 ease=f;
		 System.out.println(i+" "+a+" "+f);
	 }
	
	
	void sum()
	{
		System.out.println("Hi2");
	}
}

public class Constructor {
	public static void main(String[] args) {
		t1 obj=new t1(123,'D',false);
		obj.sum();
		
	}

}
