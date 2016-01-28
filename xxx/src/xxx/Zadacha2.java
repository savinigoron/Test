package xxx;
/*Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку, 
 * а затем этот же массив выведите на экран тоже в строку, но в обратном порядке 
 * (99 97 95 93 … 7 5 3 1).
 */
public class Zadacha2 {

	public static void main(String[] args) {
		int a=0;
		for(int i=1;i<=99;i++){
			if(i%2!=0)a++;
		}
		int[] mass=new int[a];
		int b=0;
		for(int i=1;i<=99;i++){
			if(i%2!=0){
				mass[b]=i;
				System.out.print(mass[b]+" ");
				b++;
			}
		}
		System.out.println(" ");
		for(int i=mass.length-1;i>=0;i--){
			System.out.print(mass[i]+" ");
		}
	}
	
	

}
