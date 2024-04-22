package oop;

public class RectanglePractice {
	private int width;
	private int height;
	// static 변수 추가 
	// 외부에서 접근 못하게 하기 위해 프라이빗
	private static int COUNT = 0;
	
	// static
	
	// 기본 
	public RectanglePractice(){
		this.width = 0;
		this.height = 0;
//		this(0,0);	// 생성자끼리 호출
	}

	
	// 직사각형 또는 정사각형
	public RectanglePractice(int w){
		COUNT++;
		this.width = w;
		
	}
	/////////////////////////////////////////////////////생성자
	
	
	

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public int area() {
		return width* height;
	}
	
	// static method 추가
	public static int getCount() {
		return COUNT;
	}
}
