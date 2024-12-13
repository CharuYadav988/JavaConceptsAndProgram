package Encapsulation;

class c1
{
	private int ids;
	private String name;
	
	public void setIds(int ids) {
		this.ids = ids;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
public class WriteonlyEncaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
c1 obj=new c1();
obj.setIds(456);
obj.setName("hill");
	}

}
