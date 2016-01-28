package xxx;

import java.util.Arrays;


public class InvertArray {

	public static void main(String[] args) {
	int[] arr={};
	System.out.print(Arrays.toString(arr)+"->");
	 for(int i=0;i<arr.length/2;i++){
		 int j = 0;
		swap(arr,i,j);
	System.out.println(Arrays.toString(arr));
	}
	}

	private static void swap(int[] arr, int i,int j) {
		int tmp=arr[i];
		arr[i]=arr[j];
		arr[j]=tmp;
		
	}
	}


