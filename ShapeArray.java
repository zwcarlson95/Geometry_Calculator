package Module4;

import java.util.ArrayList;

public class ShapeArray {
	
	public static void main(String[] args) {
		ArrayList<Shape> shapeArray = new ArrayList<Shape>();
		
		Sphere sphere = new Sphere(3.5);
		shapeArray.add(sphere);
		
		Cylinder cylinder = new Cylinder(4.2, 2.5);
		shapeArray.add(cylinder);
		
		Cone cone = new Cone(3.3, 1.2);
		shapeArray.add(cone);
		
		for (Shape shape : shapeArray) {
			System.out.println(shape.toString());
		}
	}

}
