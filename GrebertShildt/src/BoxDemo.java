
 class BoxDemo{
	 public static void main(String[] args){
	
	Box mybox=new Box(5, 6, 7);
	double vol;
	mybox.width=10;
	mybox.height=20;
	mybox.depth=30;
	
	vol=mybox.width*mybox.height*mybox.depth;
	System.out.println(vol);
	 }
 }
	 