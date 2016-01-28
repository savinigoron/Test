package xxx;

import java.util.Arrays;

public class ArrayInvert1 {

	public static void main(String[] args) {
			int[] data={30,50,40,20,10};
			for(int edge=data.length/2;edge>=0;edge--){
				for(int index=0;index<edge;index++){
					if( data[index]>data[index+1]){
						swap(data,index,data.length-1-index);
				}
				System.out.print(index);
			}
			System.out.println();
	}
			System.out.println(Arrays.toString(data));
}


			private static void swap(int[] array, int first, int second) {
				int tmp=array[first];
				array[first]=array[second];
				array[second]=tmp;
				
				
			}

	}


