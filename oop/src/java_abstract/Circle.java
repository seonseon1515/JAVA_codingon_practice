package java_abstract;

public class Circle extends Shape {
	private int radius;

	public Circle(String color, String type, int radius) {
		super(color, type);
		this.radius = radius;
	}
	
	public double calculateArea() {
		return radius*radius*Math.PI;
	}
	
	
	
}
