package Encapsulation;

class readonlyencaps
{
	private int id=100;
	private String name="this";
	//in read only ignore setters 
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	}
public class EncapsReadOnly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readonlyencaps obj=new readonlyencaps();
		System.out.println(obj.getId());
		System.out.println(obj.getName());
	}

}
