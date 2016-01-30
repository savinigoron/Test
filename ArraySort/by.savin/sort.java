import java.util.Arrays;

public class sort {
	public static void main(String[] args){
		int[] array=new int[20];
		for(int i=0;i<array.length;i++){
			array[i]=(int)(Math.random()*50);
		}
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
	}
}
