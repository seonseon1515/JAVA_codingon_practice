package java_abstract;

public class Bus extends Vehicle {
	// 추상 메소드 정의 하지 않으면 에러
	
	public Bus(String name) {
		super(name);
	}
	
	public void start() {
		System.out.println(getName()+"버스가 출발합니다.");
	}
	
}
