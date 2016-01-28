package xxx;

import java.util.Arrays;

public class my {

	public static void main(String[] args) {
		int[] data={20,40,50,30,10};
		for(int edge=data.length-1;edge>=0;edge--) {
			for(int index=0;index<edge;index++) {
			if(data[index]>data[index+1]) {
				swap(data, index);
			}
			System.out.print(index);
		}
			System.out.println();
	}
		System.out.println(Arrays.toString(data));
	}


	private static void swap(int[] data, int index) {
		int tmp = data[index];
		data[index]=data[(index+1)];
		data[(index+1)]=tmp;
	}
	}

		
	


