import java.util.Arrays;

public class ArrayInvert {

	public static void main(String[] args) {
		int[] array={10,20,30,40,50,60,70,80,90};
		                                       //for(int i=0;i<array.length;i++){
			                                     //array[i]=(int)(Math.random()*100);
		                                         // /}
		invert(array);
		System.out.println(Arrays.toString(array));
	}
	public static void invert(int[] arr) {
        for (int k = 0; k < arr.length / 2; k++) {
            int tmp = arr[k];
            arr[k] = arr[arr.length - k - 1];
            arr[arr.length - k - 1] = tmp;
        }
    }

}
