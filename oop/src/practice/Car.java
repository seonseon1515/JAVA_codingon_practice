package practice;

public class Car extends Vehicles {
	
	private boolean convertible;
	
	public Car(String brand, String model, int year, boolean convertible) {
		super(brand, model, year);
		this.convertible = convertible;
	}

	@Override
	public String toString() {
		return "<Car>" +super.toString()+ "[convertible=" + convertible + "]";
	}
	
	public void CarText() {
		System.out.println(toString());
		super.commonStart();
		System.out.println("주차했습니다.");
		super.commonEnd();
	}
}
