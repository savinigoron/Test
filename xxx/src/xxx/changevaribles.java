package xxx;

import java.util.Arrays;

public class changevaribles {

	public static void main(String[] args) {
			int[] array={50,10,35,0};
			//for(int bound=0;bound<array.length-1;bound++){ /*Strenght buble sort*/
			for(int bound=array.length-1;bound>=0;bound--){  /*Recursive buble sort*/
				for(int index=0;index<bound;index++){
					if(array[index]>array[index+1]){
						swap(array, bound, index);
					}
				}
			}
			System.out.println(Arrays.toString(array));
	}

	private static void swap(int[] array, int bound, int index) {
		int tmp =array[bound];
		array[bound]=array[index];
		array[index]=tmp;
	}
}