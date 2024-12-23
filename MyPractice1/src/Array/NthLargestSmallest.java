package Array;

public class NthLargestSmallest {

	public static int NthlargeSmall(int a[],int total,int n)
	//here u can give n as well so that user can decide which place element they want.
	{
		int temp;
		for(int i=0;i<total;i++)
		{
			for(int j=i+1;j<total;j++)
				
		{
			if(a[i]>a[j]) //from larger number to smaller one sorting
				//if you want smaller to larger use if(a[i]<a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		}
		return a[total-n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {22,34,56,78,89,80};
int x=a.length;
System.out.println(NthLargestSmallest.NthlargeSmall(a, x,3));
		}

}
