
public class OverloadCons {

	public static void main(String[] args) {
		Box mybox1=new Box(10,20,30);
		Box myBox2=new Box();
		Box mycube=new Box(10);
		
		System.out.println(mybox1.volume());
		System.out.println(myBox2.volume());
		System.out.println(mycube.volume());
		
		

	}

}
