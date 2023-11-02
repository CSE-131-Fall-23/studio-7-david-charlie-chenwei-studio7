package studio7;

public class Complex {
	private double realPart;
	private double imaginaryPart;
	
	public Complex(double re, double im)
	{
		this.realPart=re;
		this.imaginaryPart=im;
	}
	
	public Complex()
	{
		this.realPart=0;
		this.imaginaryPart=0;
	}
	
	public Complex add(Complex otherComplex)
	{
		double realPart = this.realPart + otherComplex.getRealPart();
		double imaginaryPart = this.imaginaryPart + otherComplex.getImaginaryPart();
		Complex sum = new Complex(realPart,imaginaryPart);
		return sum;
	}
	
	public Complex multiply(Complex otherComplex)
	{
		double realPart = this.realPart*otherComplex.getRealPart()-this.imaginaryPart*otherComplex.getImaginaryPart();
		double imaginaryPart = this.realPart*otherComplex.getImaginaryPart()+this.imaginaryPart*otherComplex.getRealPart();
		Complex product = new Complex(realPart,imaginaryPart);
		return product;
	}

	public double getRealPart() {
		return realPart;
	}

	public void setRealPart(double realPart) {
		this.realPart = realPart;
	}

	public double getImaginaryPart() {
		return imaginaryPart;
	}

	public void setImaginaryPart(double imaginaryPart) {
		this.imaginaryPart = imaginaryPart;
	}
	
	public String toString()
	{
		return this.realPart + "+" + this.imaginaryPart +"i";
	}
	
}
