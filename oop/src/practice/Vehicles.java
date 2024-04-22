package practice;

public class Vehicles {
	private String brand;
	private String model;
	private int year;
	
	public Vehicles(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}

	@Override
	public String toString() {
		return "brand=" + brand + ", model=" + model + ", year=" + year;
	}
	
	public void commonStart() {
		System.out.println("차량시동을 걸었습니다.");
	}
	
	public void commonEnd() {
		System.out.println("차량을 정지했습니다.");
	}
	
	
	
}
