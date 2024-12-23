package StringBuffer;

public class StringBufferMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer sf=new StringBuffer("Charu Yadav");
sf.replace(6, 11, "Smart");
System.out.println(sf);

System.out.println(sf.toString());
sf.delete(6,12);
System.out.println(sf);
StringBuffer sf1=new StringBuffer("Charu Yadav");

sf1.reverse();
System.out.println(sf1);



	}

}
