package studio7;

public class Rectangle {
	
	private double length;
	private double width;
	private double area;
	
	public Rectangle(double length, double width)
	{
		this.length=length;
		this.width=width;
		this.area=length*width;
	}
	
	public Rectangle()
	{
		this.length=0;
		this.width=0;
		this.area=0;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getArea()
	{
		return this.area;
	}
	
	public double getPerimeter()
	{
		return 2*(this.width+this.length);
	}
	
	public boolean ifSmaller(Rectangle otherRectangle)
	{
		if (otherRectangle.getArea()<this.area) return false;
		return true;
	}
	
	public boolean ifSquare()
	{
		if (this.width==this.length) return true;
		return false;
	}
	
}
