package java_abstract;

public abstract class Shape {
	private String color;
	private String type;
	
	public Shape(String color, String type) {
		this.color = color;
		this.type = type;
	}

	public abstract double calculateArea();
	
	public String getColor() {
		return color;
	}
}
