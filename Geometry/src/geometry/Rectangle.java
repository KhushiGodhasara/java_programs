package geometry;

public class Rectangle {
	double height, width;
	
	public void setParameters(double height,double width) 
	{
		this.height = height;
		this.width = width;
	}
	
	public double parameter()
	{
		return 2*(height+width);
	}
	
	public double area()
	{
		return height * width;
	}
}
