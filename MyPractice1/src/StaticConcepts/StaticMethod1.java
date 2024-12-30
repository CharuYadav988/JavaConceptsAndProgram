package StaticConcepts;

class a1 {
	int y=0;
	static int t=0;
	public static void ageissue() {
		final int w=0; //can not declare static variable inside static method
		int t=99;//static method can modify static variable
		call();//they can not call non static method
		
	}
	public  void call() {
		int t=89;//concrete method can also modify the static variable
		ageissue();//they can call static method 
		
	}
}
public class StaticMethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
