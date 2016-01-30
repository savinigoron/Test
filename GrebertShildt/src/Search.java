
public class Search {

	public static void main(String[] args) {
		int[] mas={1,8,3,6,7,9};
		int val=3;
		boolean found=false;
		for(int x:mas){
			if(x==val){
				found=true;
				break;
			}
		}
		if(found){
			System.out.println("FOUND!!!");
		}
	}

}
