package MyFirstProject;

public class Swap2Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//using 3 variables
		int num1=10;
		int num2=20;
		System.out.println(num1+" "+num2+" "+"Number before Swapping");
		int temp=num1;
		num1=num2;
		num2=temp; 
		
		System.out.println(num1+" "+num2+" "+"Number after Swapping");
		
		//Using 2 variables
		
		int num3=3;
		int num4=4;
		System.out.println(num3+" "+num4+" "+"Number before Swapping");
		
		num3=num3+num4;
		num4=num3-num4; 
		num3=num3-num4;
		
		
		System.out.println(num3+" "+num4+" "+"Number after Swapping");
		
	}

}
