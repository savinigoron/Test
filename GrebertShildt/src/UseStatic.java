
public class UseStatic {
	static int a=3;
	static int b;
	
	static void meth(int x){
		System.out.println("x equals "+x);
		System.out.println("a equals "+a);
		System.out.println("b equals "+b);
	}
	static{
		System.out.println("Static block initilised");
		b=a*4;
	}

	public static void main(String[] args) {
		meth(45);
	}

}
