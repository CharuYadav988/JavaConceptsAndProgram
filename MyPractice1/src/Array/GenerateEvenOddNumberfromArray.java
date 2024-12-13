package Array;

public class GenerateEvenOddNumberfromArray {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,6,7,8,9,9,4,3};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("Even numbers "+a[i]);
			}
			else
			{
				System.out.println("Odd Numbers "+a[i]);
			}
		}

	}

}
