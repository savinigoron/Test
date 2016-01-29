import java.util.Arrays;

public class Test2 {
	public static void change(int[] a){
		for(int i=0;i<a.length;i++){
			int min=i;
			for(int j=i+1;j<a.length;j++){
				if(a[j]<a[min]){
					
					min=j;
				}
			}
			swap(a, i, min);
		}
	}
	private static void swap(int[] a, int i, int min) {
		int tmp=a[i];
		a[i]=a[min];
		a[min]=tmp;
	}
	public static void main(String[] args){
		int arr[]={25,15,98,37,165};
		change(arr);
		System.out.println(Arrays.toString(arr));
	}
}
