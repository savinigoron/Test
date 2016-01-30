import java.util.Arrays;
import java.util.Collections;

public class SortAvto {

	public static void main(String[] args) {
	String[] avto={"BMW","Audi","Mersedes","Toyota","Cryisler","Bentley","Lexus","Honda","Saab"};
		for(int i=0;i<avto.length;i++)
				
		
			Arrays.sort(avto);
			
			System.out.println(Arrays.toString(avto));
			
			Arrays.sort(avto, Collections.reverseOrder());
			
			System.out.println(Arrays.toString(avto));

	}

}
