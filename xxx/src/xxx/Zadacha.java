package xxx;

import java.util.Arrays;

public class Zadacha {

	public static void main(String[] args) {
		int[] mass={11,25,1,6,17,32,45,15,12,10};
		for(int bound=mass.length-1;bound>=0;bound--) {
			for(int index=0;index<bound;index++){
				if(mass[index]>mass[index+1]){
					int tmp=mass[index];
					mass[index]=mass[index+1];
					mass[index+1]=tmp;
			
				}
		}	
			System.out.println(mass[bound]);
				
		}
	}
}
