package studio7;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction f1 = new Fraction(25,100);
		f1.simplify();
		System.out.println(f1);
		f1.setNumerator(10);
		Fraction f2 = new Fraction(6,8);
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f1.add(f2));
		Complex c1 = new Complex(1,2);
		Complex c2 = new Complex(3,4);
		System.out.println(c2);
		Complex c3 = c1.add(c2);
		System.out.println(c3);
		System.out.print(c3 + "*" + c1 + "=");
		c3=c3.multiply(c1);
		System.out.println(c3);
	}

}
