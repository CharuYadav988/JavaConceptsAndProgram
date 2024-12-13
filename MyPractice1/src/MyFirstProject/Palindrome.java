package MyFirstProject;

public class Palindrome {

	public static void main(String[] args) {
		int num=121;
		int rev=0;
		int r=0;
		int t=num;
		while(num!=0)
		{
		r=num%10;  //121%10=1 r=1 //12%10=2  //1%10=1
		rev=rev*10+r; //0+1=1  //12   //121
		num=num/10; //121/10=12  //12/10=1
		
		}
		System.out.println(rev);
		if(t==rev)
		{
			System.out.println("Number is palindrome");
			
		}
		else {
			System.out.println("Number is not  palindrome");
		}
		}
}
