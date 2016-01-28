package xxx;
/*В переменной n хранится натуральное трёхзначное число. 
 * Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
*/
public class Zadacha7 {

	public static void main(String[] args) {
		int a =565;
		int b=a%10;
		int c=(a/10)%10;
		int d=(a/100)%10;
System.out.print(b+c+d);
	}

}
