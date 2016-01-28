package xxx;

import java.util.Arrays;

public class Araysort {

	public static void main(String[] args) {
		long[] a={536,22,632,25,845,32};
		for(int i=0;i<a.length-1;i++){
			if (a[i]>a[i+1]){
				long tmp=a[i];
				a[i]=a[i+1];
				a[i+1]=tmp;
			}
			//Arrays.sort(a);
			System.out.println(Arrays.toString(a)+" ");
	}
			
	}	
}
	

	