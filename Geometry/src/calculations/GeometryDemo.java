package calculations;

import geometry.*;

public class GeometryDemo {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Triangle t1 = new Triangle();
		Rectangle r1 = new Rectangle();

		c1.setRadius(3.4f);
		System.out.println("Parameter of Circle is : " + c1.parameter());
		
		r1.setParameters(3.0,5.0);
		System.out.println("Parameter of Rectangle is : " + r1.parameter());
		
		t1.setParameters(2.0, 1.0, 3.0);
		System.out.println("Parameter of Triangle is: " + t1.parameter());	
	}

}
