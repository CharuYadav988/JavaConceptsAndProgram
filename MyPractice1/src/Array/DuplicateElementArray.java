package Array;

public class DuplicateElementArray {
	
	public static void main(String[] args) {
	int count=0;	
	int a[]= {1,2,3,7,5,6,7,8,9,9};
	for(int i=0;i<a.length;i++)
	{
		count=1;
		for(int j=i+1;j<a.length;j++)
			
	{
		if(a[i]==a[j]) 
		{
			count++;
		}
		
		
	}
		
		}	
	}

}