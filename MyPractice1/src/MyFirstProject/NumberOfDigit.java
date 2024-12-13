package MyFirstProject;

public class NumberOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=678;
		int count=0;
		while(num!=0)
		{
			num/=10;
			++count;
		}
		System.out.println("Number of digit "+count);
	}

}
