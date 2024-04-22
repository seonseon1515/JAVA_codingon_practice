package java_abstract;

public class Rectangle extends Shape {
	private int width;
	private int height;

	
	
	public Rectangle(String color, String type, int width, int height) {
		super(color, type);
		this.width = width;
		this.height = height;
	}

	

	public double calculateArea() {
		return width*height;
	}
	
	
	
}
