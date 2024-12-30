package JavaAssignments;

public class Assignment11_2ndPart {

	public static void main(String[] args) {
		String s="abcDEF@1234cfghi";
		String rev="";
		//It will take the element from last index
		for (int i=s.length()-1;i>=0;i--)//i=15;15>=0{true};15--;
			//i=14,13,12,11,10,9,8,7,6,5,4,3,2,1,0 condition will be true		
		{
			rev=rev+s.charAt(i);//rev=i;rev=ih;rev=ihg;rev=ihgf;rev=ihgfc;rev=ihgfc4;rev=ihgfc43;
			//rev=ihgfc4332;rev=ihgfc4321;rev=ihgfc4321@;rev=ihgfc4321@F;rev=ihgfc4321@FE;
			//rev=ihgfc4321@FED;rev=ihgfc4321@FEDc;rev=ihgfc4321@FEDcb;rev=ihgfc4321@FEDcba
		}
		
		System.out.println("Reverse string is - "+rev);
		
		if(rev==s)  //(ihgfc4321@FEDcba==abcDEF@1234cfghi)false
		{
			System.out.println("The Given string is palindrome");
		}
		else {
			System.out.println("The Given string is Not a palindrome");
		}

	}

}
