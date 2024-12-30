package JavaAssignments;

import java.util.Arrays;

public class Assignments10 {

	public static void main(String[] args) {
		String s="India is my country";
		System.out.println("Actual String is-->"+s);
		   //it will split the string with separator spaces and stores in an array
		String[] words = s.split(" ");
		System.out.println(Arrays.toString(words));

		  int left = 0, right = words.length - 1;//left=0 index ; right=3 index ; words.length=4
		  while (left <= right) {                //0<=3(true);1<=2(True);2<=1(FALSE)
		    String temp = words[left];           //temp=India;temp=is
		    words[left] = words[right];          //words[0]=Country;words[1]=my;
		    words[right] = temp;                 //words[3]=India;words[2]=is
		    left += 1;                  //latest array--->[Country,is,my,India];[Country,my,is,India]
		    right -= 1;
		  }
		  
		  System.out.println(Arrays.toString(words));
		  //method in Java is used to concatenate multiple strings with a specified delimiter. 
		  //This method is available since JDK 1.8
		  String ans = String.join(" ", words);
		  System.out.println("Reverse String-->"+ans);
	}

}
