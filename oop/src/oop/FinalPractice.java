package oop;

// final 실습  Circle 클래스 만들기
public class FinalPractice {
	// 반지름 radius 필드
	// 이후에 변경될 수 없도록 final 붙여줌 
	// 항상 멤버변수는 private
	private final double radius;
	// 원주율 상수 선언
	// Math 또한 static 메소드(정의 이동 시 확인 가능)
	private static final double PI = Math.PI;
	
	// 생성자를 이용한 반지름 초기화
	public FinalPractice(double radius) {
		this.radius = radius;
	} 
	
	// 원의 넓이를 계산하는 메소드
	public double calculateArea() {
		return PI * radius * radius;
	}

	// 원의 반지름 가져오기 getter 메소드
	public double getRadius() {
		return radius;
	}
	
	
	
}
