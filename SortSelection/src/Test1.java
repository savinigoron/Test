import java.util.Arrays;

public class Test1 {
	public static void selSort(int[] arr){
		for(int i=0;i<arr.length;i++){
			                                   //int min=arr[i];
			int imin=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[imin]){
					
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
			int array[]={200,11,300,26,14,9,78};
			selSort(array);
			System.out.println(Arrays.toString(array));
		}
		

}
