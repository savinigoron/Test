import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {
		int[] arr=new int[20];
		genValues(arr);
		System.out.println(Arrays.toString(arr));
		SelectionSort(arr);
		System.out.println(Arrays.toString(arr));

	}
	private static void genValues(int[] arr) {
		for(int i=0;i<arr.length;i++){
		arr[i]=(int)(Math.random()*100);
		}
	}
	public static void SelectionSort(int[] array){
		for(int index=0;index<array.length;index++){
			int minValue=index;
			for(int j=index+1;j<array.length;j++){
				if(array[j]<array[minValue] ){
					minValue=j;
				}
			}
			swap(array, index, minValue);
		}
	}
	private static void swap(int[] array, int index, int minValue) {
		int tmp=array[index];
		array[index]=array[minValue];
		array[minValue]=tmp;
	}
}
