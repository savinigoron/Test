import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] array=new int[30];
		for(int i=0;i<array.length;i++){
			array[i]=(int)(Math.random()*100);
		}
		System.out.println(Arrays.toString(array)+"non sorted");
		Sorting(array);
		System.out.println(Arrays.toString(array)+"already sorted");

	}
	public static void Sorting(int[] arr){
		for(int i=0;i<arr.length;i++){
			int min=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[min]>arr[j]){
					min=j;
				}
			}
			int tmp=arr[i];
			arr[i]=arr[min];
			arr[min]=tmp;
		}
	}
}
