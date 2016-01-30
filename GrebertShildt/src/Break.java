
public class Break {

	public static void main(String[] args) {
		outer: for( int i=0;i<100;i++){
			System.out.print("Line "+i+" : ");
				for(int j=0;j<100;j++){
					if(j==10)break outer;
					System.out.print(j+" ");
				}
				System.out.println();
		}
	
			System.out.println("Finish!!");
	
	}

}
