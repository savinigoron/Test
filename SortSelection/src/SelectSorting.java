import java.util.Arrays;

public class SelectSorting {

	public static void sortArray(int[] a) {
		
		for(int index=0;index<a.length;index++){
			int minValue=a[index];
			int minIndex=index;
			for(int scan=index+1;scan<a.length;scan++){
				if(a[scan]<minValue)	{				
					minValue=a[scan];
					minIndex=scan;
			}
		}
			if(index!=minIndex){
			int tmp=a[index];
			a[index]=a[minIndex];
			a[minIndex]=tmp;
			
			}
		}
	}


	public static void main(String[] args){
		int array[]={7,5,3,1,4,6,60,25,11,55,35};
		sortArray(array);
		System.out.println(Arrays.toString(array));
	}	
}