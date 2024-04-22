package oop;
import java.util.ArrayList;

public class Final {
	
	public static void main(String[] args) {
		final int x = 10;
		//x = 20; // 오류!!! 한번 할당 후 재할당 불가
		
//		메서드 안에서 써야 컴파일 오류가 나지 않음.
		final ArrayList<String> list = new ArrayList<>();
		list.add("Hello");
//		list = new ArrayList<>(); 
		
//		메소드에 final 시 오버라이딩이 될 수 없습니다. 
//		클래스에 final 시 더 이상 상속할 수 없습니다.
	}
}
