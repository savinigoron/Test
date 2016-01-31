
public class PassOb {

	public static void main(String[] args) {
		TestLast ob1=new TestLast(20, 30);
		TestLast ob2=new TestLast(20, 30);
		TestLast ob3=new TestLast(12, 15);
		
		System.out.println(ob1.equals(ob2));
		System.out.println(ob2.equals(ob3));

	}

}
