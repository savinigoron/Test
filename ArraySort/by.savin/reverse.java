import java.util.Arrays;
import java.util.Collections;



public class reverse {
	public static void main(String[] args){
		Integer[] array=new Integer[20];
		for(int i=0;i<array.length;i++){
			array[i]=(int)(Math.random()*50);
			
		}
			System.out.println(Arrays.toString(array));
		Arrays.sort(array, Collections.reverseOrder());
		
			System.out.println(Arrays.toString(array));
		
	}
}
