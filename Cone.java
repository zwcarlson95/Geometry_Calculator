package Module4;

public class Cone extends Shape{
	
	private double radius;
	private double height;
	
	public Cone(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	public String toString() {
		return "Surface Area of Cone: " + surfaceArea() + "   Volume of Cone: " + volume();
	}
	
	@Override
	public double surfaceArea() {
		return ((Math.PI * radius) * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2))));
	}
	
	@Override
	public double volume() {
		return (Math.PI * Math.pow(radius, 2) * (height/3));
	}

}
