import java.util.Arrays;

public class Test4 {

	public static void main(String[] args) {
		int[] mass=new int[30];
		for(int i=0;i<mass.length;i++){
			mass[i]=(int)(Math.random()*100);
		}
		System.out.println(Arrays.toString(mass)+"whithout sorting");
		SortSelection(mass);
		System.out.println(Arrays.toString(mass)+"whith sorting");

	}
	public static void SortSelection(int[] a){
		for(int i=0;i<a.length;i++){
			int min=i;
			for(int j=i+1;j<a.length;j++){
				if(a[j]<a[min]){
					min=j;
				}
			}
			int tmp=a[i];
			a[i]=a[min];
			a[min]=tmp;
		}
	}
}
