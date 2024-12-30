package JavaAssignments;

import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[3][3];
		int row,col,product=1;
		
		System.out.println("Enter 3*3 matrix Elements");
		for(row=0;row<3;row++)
			for(col=0;col<3;col++)
				arr[row][col]=sc.nextInt();
		
		System.out.println("Matrix elements are");
		for(row=0;row<3;row++) {
			for(col=0;col<3;col++)
			{
				System.out.print(arr[row][col]+" ");
			}
			System.out.println("\n");
		}
		
		 for(row=0;row<3;row++)
	            for(col=0;col<3;col++)
	                product*=arr[row][col];
		 
		 System.out.println("The product of all the matrix elements is : "+product);
		
	}

}
