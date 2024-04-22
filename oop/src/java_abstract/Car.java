package java_abstract;

public class Car extends Vehicle {
	// 상속 받고 나서 추상 메소드를 구현하지 않으면 에러가 남.
	
	public Car(String name) {
		super(name);
	}
	
	public void start() {
		//super를 명시하지 않고 사용하는 것도 가능하지만 명시위해 작성
		System.out.println(super.getName()+"자동차가 출발 합니다.");
	}
}
