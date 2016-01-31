
public class BoxDemo2 {

	public static void main(String[] args) {
		Box mybox1=new Box(7, 15, 9);
		Box mybox2=new Box(14, 85, 65);
		double vol;
		mybox1.depth=10;
		mybox1.height=10;
		mybox1.width=10;
		mybox2.depth=20;
		mybox2.height=20;
		mybox2.width=20;
		vol=mybox1.depth*mybox1.height*mybox1.width;
		System.out.println("mybox1 vol = " +vol);
		vol=mybox2.depth*mybox2.height*mybox2.width;
		System.out.println("mybox2 vol = "+vol);
		

	}

}
