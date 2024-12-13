package MyFirstProject;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int num=124567;
	int rev=0;
	int r=0;
	
	while(num!=0)
	{
	r=num%10;  //121%10=1 r=1 //12%10=2  //1%10=1
	rev=rev*10+r; //0+1=1  //12   //121
	num=num/10; //121/10=12  //12/10=1
	
	}
	System.out.println(rev);

}
}
