package TestDemo;

import java.util.Arrays;

public class CoreJava {

	public static void main(String[] args) {
int a[]= {1,2,3,4};
int arr[]=new int[2];
int target=6;
for (int i = 0; i < a.length; i++) {
    for (int j = i + 1; j < a.length; j++) {
        if (a[j]+a[i]==target) {
           arr[0]=i;
           arr[1]=j;
           break;
        }
        }
  
}
System.out.println(Arrays.toString(arr));
}
}