package xxx;
/*Вычислить и вывести на экран косинусы углов в 60, 45 и 40 градусов
 *  без использования функции Math.toDegrees(n).
*/
public class Zadaacha11 {

	public static void main(String[] args) {
	//Ad = Ar * 180 / пи
		//Где Ad — угол в градусах, Ar — угол в радианах.	
		int a=40;int b=60; int c=45;
		double aRad=a*Math.PI/180;
		double bRad=b*Math.PI/180;
		double cRad=c*Math.PI/180;
		System.out.println("Косинус угла "+a+" ="+(float)Math.cos(aRad));
		System.out.println("Косинус угла "+b+" ="+(float)Math.cos(bRad));
		System.out.println("Косинус угла "+c+" ="+(float)Math.cos(cRad));
		System.out.println("Косинус угла "+c+" ="+Math.cos(Math.toDegrees(c)));
	}

}
