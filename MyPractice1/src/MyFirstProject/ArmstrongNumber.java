package MyFirstProject;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int num=153;//1*1*1+5*5*5+3*3*3
		int actualNum=num;
		double result=0;
		while(actualNum!=0)
		{
			int n=actualNum%10;
			result=result+Math.pow(n, 3);
			actualNum=actualNum/10;
			
			}
		
	if(result==num)
	{
		System.out.println("Number is armstrong");
	}
	else
	{
		System.out.println("Number is Not armstrong");
	}
	}
}
