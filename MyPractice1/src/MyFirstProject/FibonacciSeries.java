package MyFirstProject;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n1=1;
		int n2=2;
		int n3;
		System.out.print(n1+" "+n2+" ");
		int count =10;
		for(int i=2;i<count;i++)
		{
			n3=n1+n2;
			//if(n3<=10) {}in case we want to print fm 1 to 10
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
		
	}
}
