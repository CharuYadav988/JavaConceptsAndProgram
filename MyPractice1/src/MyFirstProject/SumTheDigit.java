package MyFirstProject;

public class SumTheDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=123;
		int sum=0;
		
		while(num!=0)
		{
			int x=num%10;
			sum=sum+x;
			num=num/10;
			
		}
		System.out.println(sum);
	}

}
