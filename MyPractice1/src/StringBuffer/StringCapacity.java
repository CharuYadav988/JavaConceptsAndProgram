package StringBuffer;

public class StringCapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer sb=new StringBuffer();
System.out.println(sb.capacity());//By default 16
sb.append("Hii");
System.out.println(sb.capacity());//Now 16
sb.append(" my name is Java");
System.out.println(sb.capacity());//16*2+2=34

	}

}
