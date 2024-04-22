package oop;

public class RectanglePlus {

	private int width;
	private int height;
	
	
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
	
	// 기본 
	RectanglePlus(){
//		this.width = 0;
//		this.height = 0;
//		this(0,0);	// 생성자끼리 호출
	}

	// 정사각형
	RectanglePlus(int width){
		this.width = width;
//		this.height = num;
//		this(num,num); // 위의 인수 없는 기본 생성자에서 호출을 받아주는 생성자
	}
	
	int area() {
		return width* height;
	}
	
	
}
