package Module4;

public class Cylinder extends Shape{
	
	private double radius;
	private double height;
	
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	public String toString() {
		return "Surface Area of Cylinder: " + surfaceArea() + "   Volume of Cylinder: " + volume();
	}
	
	@Override
	public double surfaceArea() {
		return ((2 * (Math.PI * radius * height)) + (2 * (Math.PI * Math.pow(radius, 2))));
	}
	
	@Override
	public double volume() {
		return (Math.PI * Math.pow(radius, 2) * height);
	}

}
