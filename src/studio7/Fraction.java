package studio7;

public class Fraction {

	private int numerator;
	private int denominator;
	private double value;
	
	public Fraction(int numerator, int denominator)
	{
		this.numerator=numerator;
		this.denominator=denominator;
		this.value=numerator*1.0/denominator;
	}
	
	public static int gcd(int a, int b)
	{
		if (a<b) return gcd(b,a);
		if (a%b==0) return b;
		return gcd(b,a%b);
	}
	
	public void simplify()
	{
		int gcd=gcd(this.numerator,this.denominator);
		this.numerator=this.numerator/gcd;
		this.denominator=this.denominator/gcd;
	}
	
	public Fraction add(Fraction otherFraction)
	{
		int summedNumerator = this.numerator * otherFraction.getDenominator() + this.denominator*otherFraction.getNumerator();
		int summedDenominator = this.denominator * otherFraction.getDenominator();
		Fraction sum = new Fraction(summedNumerator,summedDenominator);
		sum.simplify();
		return sum;
	}
	
	public Fraction multiply(Fraction otherFraction)
	{
		int multipliedNumerator = this.numerator*otherFraction.getNumerator();
		int multipliedDenominator = this.denominator*otherFraction.getDenominator();
		Fraction product = new Fraction(multipliedNumerator,multipliedDenominator);
		product.simplify();
		return product;
	}
	
	public Fraction reciprocal()
	{
		Fraction reciprocal = new Fraction(this.denominator,this.numerator);
		return reciprocal;
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
		this.value=numerator*1.0/denominator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
		this.value=numerator*1.0/denominator;
	}

	public double getValue() {
		return value;
	}
	
	public String toString()
	{
		return this.numerator + "/" + this.denominator + "=" + this.value;
	}
	
}
