
public class OverloadDemo {
	void test(){
		System.out.println("no one parametr");
	}
	void test(int a){
		System.out.println("a: "+a);
	}
	void test(int a,int b){
		System.out.println("a and b: "+a+" "+b);
	}
	void test(double a){
		System.out.println("Entires conversion when test(double) a "+a);
	}
}
