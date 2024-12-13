package AccessModifiers;


public class Private {

	private void message()
	{
	
		System.out.println("Private Method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//u can access it within a class but not outside the class
Private obj=new Private();
obj.message();

	}

}
