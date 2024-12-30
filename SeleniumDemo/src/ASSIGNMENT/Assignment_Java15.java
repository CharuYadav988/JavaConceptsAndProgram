package ASSIGNMENT;

class reverse
{
	public static String rev(String s)
	{
		String[] words = s.split("\\s");
		  int left = 0, right = words.length - 1;
		  while (left <= right) {
		    String temp = words[left];
		    words[left] = words[right];
		    words[right] = temp;
		    left += 1;
		    right -= 1;

	}
		  String ans = String.join(" ", words);
		  return ans;
	}

public class Assignment_Java15 {

	public static void main(String[] args) {
		String s="India is my country";
		reverse.rev(s);
	}
		

	}

}
