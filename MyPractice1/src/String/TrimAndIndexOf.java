package String;

public class TrimAndIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="  India is my countr is my";
String str2=str.trim();
System.out.println("Before trim "+str);
System.out.println("After trim "+str2);
int x=str.indexOf("is");
System.out.println(x);
int x1=str.indexOf("is",9);
System.out.println(x1);
	}

}
