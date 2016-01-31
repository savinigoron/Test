
public class BoxDemo7 {

	public static void main(String[] args) {
		Box myBox1=new Box(10,20,30);
		Box myBox2=new Box();
		Box myBox3=new Box(10);
		Box myclone=new Box(myBox1);
		double vol;
		
		vol=myBox1.volume();
		System.out.println(vol);
		vol=myBox2.volume();
		System.out.println(vol);
		vol=myBox3.volume();
		System.out.println(vol);
		vol=myclone.volume();
		System.out.println(vol);
		

	}

}
