package by.savin;

import java.util.Arrays;

public class SelandBublSort {

	public static void main(String[] args) {
		int[] mass=new int[25];
		for(int i=0;i<mass.length;i++){
			mass[i]=(int)(Math.random()*100);
		}
		System.out.println(Arrays.toString(mass)+"non sorted array");
		bubleSort(mass);
		System.out.println(Arrays.toString(mass)+"bubleSort");
		selectSort(mass);
		System.out.println(Arrays.toString(mass)+"selectSort");
	}
	public static void selectSort(int[] arr){
		for(int i=0;i<arr.length;i++){
			int min=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[min]){
					min=j;
				}
			}
			int tmp=arr[i];
			arr[i]=arr[min];
			arr[min]=tmp;
		}
	}
	public static void bubleSort(int[] barr){
		for(int i=0;i<barr.length;i++){
			for(int j=0;j<barr.length-1;j++){
				if(barr[j]>barr[j+1]){
					int tmp=barr[j];
					barr[j]=barr[j+1];
					barr[j+1]=tmp;
				}
			}
		}
	}
}
