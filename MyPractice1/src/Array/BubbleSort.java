package Array;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]={23,56,7,9};
int temp;
for(int i=0;i<a.length;i++)
{
	for(int j=i+1;j<a.length;j++)
		
{
	if(a[i]<a[j]) //from larger number to smaller one sorting
		//if you want smaller to larger use if(a[i]>a[j])
	{
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
}
	}
for(int x:a)
{
	System.out.println(x);
	}
	}

}
