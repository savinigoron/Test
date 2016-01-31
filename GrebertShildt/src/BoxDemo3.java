
 class BoxDemo3 {

	public static void main(String[] args) {
	Box	mybox1=new Box(1, 2, 3);
	Box	mybox2=new Box(5, 8, 9);
	double vol;
	mybox1.depth=10;
	mybox1.height=12;
	mybox1.width=15;
	
	mybox2.depth=20;
	mybox2.height=25;
	mybox2.width=30;
	
	vol=mybox1.volume();
	System.out.println(vol);
	vol=mybox2.volume();
	System.out.println(vol);
	
	}

}
