
public class func {

	public static void main(String[] args) {
		boolean a = true;
		boolean b;
		b = a || true; // b �������
		b = !b; // b �����
		System.out.println(b); // ������� false
		a = a || b; // a �������
		boolean c;
		c = a && (a||b); //� �������
		System.out.println(c); // ������� true/
		
		boolean m;
		m = 5 >= 4; // ������
		m = 5 != 5 || false; // ����
		boolean w;
		w = m == false; // ������
		System.out.println(w); // ������� true
	}

}
