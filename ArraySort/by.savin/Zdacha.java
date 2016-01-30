import java.util.Arrays;

public class Zdacha {

	public static void main(String[] args) {
		int[] mass=new int[20];
		for(int i=0;i<mass.length;i++){
			mass[i]=(int)(Math.random()*100);
		}
		System.out.println(Arrays.toString(mass));
		bublSortRevers(mass);
		System.out.println(Arrays.toString(mass));
	}
	public static void bublSortRevers(int[] args){
		for(int i=0;i<args.length;i++){
			for(int j=0;j<args.length-1;j++){
				if(args[j]<args[j+1]){
					int tmp=args[j];
					args[j]=args[j+1];
					args[j+1]=tmp;
				}
			}
		}
	}
}

