package MyFirstProject;

import java.util.Scanner;

public class MenuDrivenCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		double num1,num2,result;
		char operator;
		System.out.println("Enter the operator");
		operator=sc.next().charAt(0);
		System.out.println("Enter the number 1 = ");
		num1=sc.nextDouble();
		System.out.println("Enter the number 2 = ");
		num2=sc.nextDouble();
		switch(operator)
		{
		case '+':
			result=num1+num2;
			System.out.println("Addition of numbers are = "+result);
			break;
			
		case '-':
			result=num1-num2;
			System.out.println("Difference of numbers are = "+result);
			break;
			
		case '*':
			result=num1*num2;
			System.out.println("Product of numbers are = "+result);
			break;
			
		case '/':
			result=num1/num2;
			System.out.println("Division of numbers are = "+result);
			break;
			
		default:
				System.out.println("Invalid inputs");
				
			
			
		}
		sc.close();
		
	}

}
