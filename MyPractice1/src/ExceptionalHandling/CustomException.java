package ExceptionalHandling;

class exceptionhandling extends Exception{
	
	public exceptionhandling(String msg) {
		System.out.println(msg);
	}
	
}

class invalidage{
	public static void ageIssue(int age) throws exceptionhandling {
		if(age<18)
		{
			throw new exceptionhandling("Age is invalid");
		}
		else {
			System.out.println("Age is fine");
		}
	}
}
public class CustomException {

	public static void main(String[] args) throws exceptionhandling {
		// TODO Auto-generated method stub
		invalidage.ageIssue(12);
	}

}
