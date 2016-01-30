import java.util.Arrays;
import java.util.Collections;

public class SortString {

	public static void main(String[] args) {
		String string[]={"Roma","Vasya","Petya","Alena","Katya"};
		for(int i=0;i<string.length;i++)
			Arrays.sort(string, Collections.reverseOrder());
			System.out.println(Arrays.toString(string));
		

	}

}
