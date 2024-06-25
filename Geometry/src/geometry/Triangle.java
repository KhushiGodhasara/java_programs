package geometry;

public class Triangle {
	double a,b,c;
	
	public void setParameters(double a, double b, double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double parameter()
	{
		return a+b+c;
	}
	
	public double area()
	{
		return (b * c)/2;
	}
}
