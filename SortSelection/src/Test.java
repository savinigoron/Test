import java.util.Arrays;

public class Test {
	public static void selSort(int[] arr){
		for(int i=0;i<arr.length;i++){
			int min=arr[i];
			int imin=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<min){
					min=arr[j];
					imin=j;
				}
			}
		//	if(imin!=i){
				int tmp=arr[i];
				arr[i]=arr[imin];
				arr[imin]=tmp;
			//}
		}
	}
		public static void main(String[] args){
			int array[]={75,11,95,26,14,9,78};
			selSort(array);
			System.out.println(Arrays.toString(array));
		}
		
	}
	
	
	
	
	
	
	
	

