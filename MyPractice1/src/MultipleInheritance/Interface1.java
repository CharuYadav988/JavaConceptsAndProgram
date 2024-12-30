package MultipleInheritance;

public interface Interface1 {
	int y=80;//final and static variables
	void m1();// abstract method
	default void d1() {
		//default method require definition and declaration both at interface level		
		System.out.println("Default method of interface1");
	}
	
	static void s1() {
		//Static method require definition and declaration both at interface level		
		System.out.println("Default method of interface1");
	}
	
	

}
