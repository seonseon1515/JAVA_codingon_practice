package oop;
import java.io.InputStream;
import java.util.Scanner;

public class Rectangle {
	private int width;
	private int height;
	
	// 기본 
	Rectangle(){
//		this.width = 0;
//		this.height = 0;
		this(0,0);	// 생성자끼리 호출
	}

	// 정사각형
	Rectangle(int num){
//		this.width = num;
//		this.height = num;
		this(num,num); // 위의 인수 없는 기본 생성자에서 호출을 받아주는 생성자
	}
	
	// 직사각형 또는 정사각형
	Rectangle(int w,int h){
		this.width = w;
		this.height = h;
	}
	
	int area() {
		return width* height;
	}
	

	
}
