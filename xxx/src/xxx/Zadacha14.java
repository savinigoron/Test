package xxx;
/*Создать программу, выводящую на экран ближайшее к 10 из двух чисел,
 *  записанных в переменные m и n. 
 * Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.
 * 
 */
public class Zadacha14 {

	public static void main(String[] args) {
		double m=9.50;
		double n=11.45;
			double a =10;
			if(Math.abs(a-m)<Math.abs(a-n)){
				System.out.println(m);
			}
			if(Math.abs(a-m)>Math.abs(a-n)){
				System.out.println(n);
			}
	}

}
