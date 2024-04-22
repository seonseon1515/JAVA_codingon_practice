package practice;

public class Bus extends Vehicles{
	private int passengerCapacity;
	
	public Bus(String brand, String model, int year, int passengerCapacity) {
		super(brand, model, year);
		this.passengerCapacity = passengerCapacity;
	}

	@Override
	public String toString() {
		return "<Bus>" +super.toString()+ "[passengerCapacity=" + passengerCapacity + "]";
	}
	
	public void BusText() {
		System.out.println(toString());
		super.commonStart();
		System.out.println("승객을 운송합니다.");
		super.commonEnd();
	}
	
}
