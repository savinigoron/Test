
public class BoxDemo4 {

	public static void main(String[] args) {
		Box mybox1=new Box(45, 85, 62);
		Box mybox2=new Box(14, 12, 62);
		
		
		mybox1.depth=10;
		mybox1.height=15;
		mybox1.width=2;
		
		mybox2.depth=3;
		mybox2.height=6;
		mybox2.width=9;
		
		
		System.out.println("My box1 volume is "+mybox1.volume());
		
		System.out.println("My box2 volume is "+mybox2.volume());
	}

}
