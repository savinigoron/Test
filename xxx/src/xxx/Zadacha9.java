package xxx;
/*Натуральное положительное число записано в переменную n. 
 * Создайте программу, которая будет генерировать и выводить на экран 
 * целое псевдослучайное число из отрезка [-n;n]
*/
public class Zadacha9 {

	public static void main(String[] args) {
		 int n=6;
		    int a=(int)(Math.random()*(2*n+1))-n;
		    System.out.println("Случайное число из отрезка "+(n*-1)+","+n+" равно " +a);
	}

}
