package oop;

public class Calculator {
	
	// 접근 제어자 반환값 함수명
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public int subtract(int num1, int num2) {
		return num1- num2;
	}
	
	public int multiply(int num1, int num2) {
		return num1*num2;
	}
	
	public double divide(int num1, int num2) {
		if(num2 !=0) {
			return (double) num1 / num2;
		} else {
			throw new IllegalArgumentException("오류");
		}
	}
	
}
