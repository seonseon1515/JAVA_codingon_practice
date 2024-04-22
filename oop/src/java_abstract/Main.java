package java_abstract;

public class Main {

	public static void main(String[] args) {
		Car car = new Car("기아");
		car.start();
		
		Bus bus = new Bus("420번");
		bus.start();
		
		
		// 추상 클래스 실습
		// 상속 - 다형성(앞부분은 부모, 뒷부분은 자식 클래스)
		Student kim = new Kim("김철수", "ABC고등학교",17,20220001);
		Student baek = new Baek("백연희", "NXC고등학교",89, 24825345);
		
		kim.print();
		baek.print();
	}

}
