package by.savin;

import java.util.Arrays;

public class BubleSort1 {

	public static void main(String[] args) {
		int[] mass=new int[30];
		for(int i=0;i<mass.length;i++){
			mass[i]=(int)(Math.random()*300);
		}
		System.out.println(Arrays.toString(mass));
		sortBuble(mass);
		System.out.println(Arrays.toString(mass));

	}
public static void sortBuble(int[] args){
	for(int i=args.length-1;i>=0;i--){
		for(int j=0;j<i;j++){
	//for(int i=0;i<args.length;i++){
		//for(int j=0;j<args.length-1;j++){
			if(args[j]>args[j+1]){
				int tmp=args[j];
				args[j]=args[j+1];
				args[j+1]=tmp;
			}
		}
	}
}
}
