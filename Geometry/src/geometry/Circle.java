package geometry;

public class Circle 
{
	float radius;
	
	public void setRadius(float radius)
	{
		this.radius = radius; 
	}
	
	public float parameter()
	{
		return 2*3.14f*radius;
	}
	
	public float area()
	{
		return 3.14f*radius*radius;
	}
}
