package Array;

public class ArrayIteration1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,7,8};
		
		String s[]={"Hi","Helllo","Bi","Bye"};
	//	for(int i=0;i<a.length;i++)
		//{
	//		System.out.println(a[i]);	
		//
		for(int x:a)   //For each loop
		{
					System.out.println(x);
		}
		
	// iterate through string
		
	for(String b:s)   //For each loop
	{
				System.out.println(b);}
}
        
}
