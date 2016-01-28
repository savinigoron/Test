package xxx;

public class TwoDaray2 {

	public static void main(String[] args) {
	int mass[][]=new int[4][];
	mass[0]=new int[1];
	mass[1]=new int[2];
	mass[2]=new int[3];
	mass[3]=new int[4];
	int i,j,k=0;
	for (i=0;i<4;i++)
		for(j=0;j<i+1;j++){
			mass[i][j]=k;
			k++;
		}
	for (i=0;i<4;i++){
		for(j=0;j<i+1;j++)
			System.out.print(mass[i][j]+" ");
		System.out.println();
		}
	}
}
