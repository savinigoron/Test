
public class func {

	public static void main(String[] args) {
		boolean a = true;
		boolean b;
		b = a || true; // b истинно
		b = !b; // b ложно
		System.out.println(b); // выведет false
		a = a || b; // a истинно
		boolean c;
		c = a && (a||b); //с истинно
		System.out.println(c); // выведет true/
		
		boolean m;
		m = 5 >= 4; // истина
		m = 5 != 5 || false; // ложь
		boolean w;
		w = m == false; // истина
		System.out.println(w); // выведет true
	}

}
