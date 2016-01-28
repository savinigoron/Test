package xxx;

public class TwoDarray1 {

	public static void main(String[] args) {
		int mass[][]=new int[6][8];
		int i,j,k=0;
		for(i=0;i<6;i++)
			for(j=0;j<8;j++){
				mass[i][j]=k;
				k++;
			}
		for(i=0;i<6;i++){
			for(j=0;j<8;j++)
				System.out.print(mass[i][j]+" ");
			System.out.println();

	}
	}
}
