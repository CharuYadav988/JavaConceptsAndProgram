package String;

public class StringReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="India@is my country";
//replaceall will work on string or any symbol or spaces u want to replace
String str1=str.replaceAll("@", "");
System.out.println(str1);

//replace will replace string,symbol,SPECIFIC CHARACTER,Spaces

String str2=str.replace('i', '@');
System.out.println(str2);
	}

}
