package xxx;

import java.util.Arrays;

public class mathrand {

	public static void main(String[] args) {
			int array[]=new int[15];
			for(int i=0;i<array.length;i++) {
				array[i]=(int)(Math.random()*1000);
				//System.out.print(array[i]+" ");
				}
			System.out.print("\n");
		Arrays.sort(array);	
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}

}
