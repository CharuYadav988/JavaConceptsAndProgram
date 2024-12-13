package Encapsulation;

class encaps{
	private int i;
	
	//right click on proj-->source--->generate getters and Setters
	
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	private String s;
	
}
public class Encapsulation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encaps obj=new encaps();
		obj.setS("Charu Yadav");
		System.out.println(obj.getS());

	}

}
