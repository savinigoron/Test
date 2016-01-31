
public class BoxDemo5 {
	public static void main(String[] args){
		Box mybox1=new Box(4, 6, 2);
		Box mybox2=new Box(4, 9, 3);
		
		//mybox1.setDim(15, 25, 35);
		//mybox2.setDim(10, 20, 60);
		System.out.println(mybox1.volume());
		System.out.println(mybox2.volume());
	}
}
