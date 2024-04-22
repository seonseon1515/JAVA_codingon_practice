package practice;

public class Motorcycle extends Vehicles {
	
	// 저장 안되어서 오류 날 수 있음 주의
	private char licenseType;
	
	public Motorcycle(String brand, String model, int year, char licenseType) {
		super(brand, model, year);
		this.licenseType = licenseType;
	}

	@Override
	public String toString() {
		return "<Motorcycle>" +super.toString()+ "[licenseType=" + licenseType + "]";
	}
	
	public void MotorcycleText() {
		System.out.println(toString());
		super.commonStart();
		System.out.println("울림통을 한답니다.");
		super.commonEnd();
	}
}

