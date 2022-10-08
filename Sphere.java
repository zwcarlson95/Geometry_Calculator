package Module4;

public class Sphere extends Shape {
	
	private double radius;
	
	public Sphere(double radius) {
		this.radius = radius;
	}
	
	public String toString() {
		return "Surface Area of Sphere: " + surfaceArea() + "   Volume of Sphere: " + volume();
	}
	
	@Override
	public double surfaceArea() {
		return (4 * (Math.PI * Math.pow(radius,  2)));
	}
	
	@Override
	public double volume() {
		return (((float)4/3) * Math.PI * Math.pow(radius,  3));
	}
	
}
