package oop;

/**
 * 
 */
/**
 * 
 */
public class Car {

	// 멤버변수 (데이터, 변수, 필드)
	// private는 오류 유발
	private int speed; // 무조건 private
	
	// 생성자 => 안 만들어도 되고 여러 개를 만들 수 있음
	Car(){
//		this.speed =1;
		if(speed>0) {
			this.speed = speed;
		}
	}
	
	public Car(int speed){
		this.speed = speed;
	}
	
	// 메서드
	void start() {
		System.out.println("Engine Start");
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// getter
//	public int getSpeed() {
//		return speed;
//	}
//	
//	// setter
//	public void setSpeed(int num) {
//		if(num<0) {
//		this.speed = Math.abs(num);
//		} else {
//			this.speed = num;
//		}
//	}
}
