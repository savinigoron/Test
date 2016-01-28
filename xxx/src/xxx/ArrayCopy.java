package xxx;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
	int[] array={10,20,30,40,50};
	int [] mass={60,70,80,90,100};
	System.arraycopy(array, 2, mass, 3, 2);
	System.out.println(Arrays.toString(mass));
	//System.arraycopy(src, srcPos, dest, destPos, length);

	}

}
