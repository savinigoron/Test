
public class ForEarch {

	public static void main(String[] args) {
		int sum=0;
		int mas[][]=new int[3][5];
		for(int i=0;i<3;i++){
			for(int j=0;j<5;j++){
				mas[i][j]=(i+1)*(j+1);
			}
			for(int x[]:mas){
				for(int y:x){
					System.out.println(y);
					y+=sum;
				}
				System.out.println(sum);
			}
		}
	}

}
