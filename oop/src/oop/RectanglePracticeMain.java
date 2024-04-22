package oop;
import java.util.Scanner;
import java.util.ArrayList;

public class RectanglePracticeMain {

	public static void main(String[] args) {
		
		FinalPractice circle = new FinalPractice(10);
		// 원의 넓이 계산
		double area = circle.calculateArea();
		
		// 결과
		System.out.println("원의 반지름을 입력하세요: " + 10);
		// private 함수 이므로 getter를 통해 가져옴
		System.out.println("원의 반지름: " + circle.getRadius());
		System.out.println("원의 넓이: " + area);
		
		// 실습문제 
//		Scanner scan = new Scanner(System.in);
//		ArrayList<RectanglePractice> rectangles = new ArrayList<>();
//		
//		while(true) {
//			System.out.println("가로 길이를 입력해주세요.");
//			int width = scan.nextInt();
//			System.out.println("세로 길이를 입력해주세요.");
//			int height = scan.nextInt();
//			
//			if(width == 0 && height ==0) {
//				break;
//			}
//			
//			RectanglePractice rect = new RectanglePractice(width);
//			rect.setHeight(height);
//			
//			rectangles.add(rect); // 곱해준 값을 넣는 거 아님?
//		}
//		
//			for(RectanglePractice r: rectangles) {
//				System.out.println("가로 길이는 " + r.getWidth());
//				System.out.println("세로 길이는 " + r.getHeight());
//				System.out.println("넓이는 : "+ r.area());
//				System.out.println("--------------------------------");
//			}
//			
//			// static 출력
//			// static의 특징: 인스턴스 생성 없이 바로 접근 가능
//			System.out.println("사각형의 개수는 :" + RectanglePractice.getCount());
//			
//			int multiply = MathMultiply.square(6);
//			System.out.println(multiply);
//			scan.close();
	}

}
