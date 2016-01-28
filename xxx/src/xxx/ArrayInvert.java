package xxx;

import java.util.Arrays;

public class ArrayInvert {

	public static void main(String[] args) {
	int[] data={30,50,40,20,10};
	for(int index=0;index<data.length/2;index++){
		swap(data,index,data.length-1-index);
	}
	System.out.println(Arrays.toString(data));
	}

	private static void swap(int[] array, int first, int second) {
		int tmp=array[first];
		array[first]=array[second];
		array[second]=tmp;
		
		
	}

}
