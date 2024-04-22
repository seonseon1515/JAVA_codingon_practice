package oop;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 인스턴스 객체 생성할 때 생성자를 통해 초기값을 줘야함
//		Calculator calc = new Calculator();
//		System.out.println(calc.add(20,20));
//		System.out.println(calc.subtract(100,55));
//		System.out.println(calc.multiply(4,5));
//		System.out.println(calc.divide(30,20));
		// gkawlgns
		
		
		// Car
					// 생성자 부분(값 초기 설정)
		Car hyundai = new Car(30);
		Car kia = new Car(50);
		hyundai.start();
		kia.start();
//		System.out.println(hyundai.speed); //0
//		System.out.println(kia.speed);
		hyundai.setSpeed(100);
		kia.setSpeed(88);
		System.out.println(hyundai.getSpeed());
		System.out.println(kia.getSpeed()); 
		
		// Rectangle class
		// 생성자에 값을 안 넣어주면 오류남
//		Rectangle rect = new Rectangle(5);
//		System.out.println(rect.area());
		
		// RectanglePlus 
		RectanglePlus rect = new RectanglePlus();
		ArrayList<RectanglePlus> rectArray = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		int w1 = scan.nextInt();
		int h1 = scan.nextInt();
		
		
//		while(w1>0 && h1>0) {
//			rectArray.add(rect.RectanglePlus(width),rect.setHeight(height)));
//			
//				if(w1 ==0 && h1==0) {
//				return  rectArray;
//			}
//		}
//		
//	}

	private static RectanglePlus rect(int w1) {
		// TODO Auto-generated method stub
		return null;
	}
}
