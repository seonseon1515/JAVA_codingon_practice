package store;
import oop.Car;

public class Main {

	public static void main(String[] args) {
		// 만들어 놓은 생성자를 통해 값을 할당
		Bookstore bookstore = new Bookstore("교보문고", 1000);
		bookstore.print();
		
		// 메소드가 아닌 변수 그 자체를 가져오는 거라서 getter 메소드가 필요한건가?
		Car kia = new Car(20);
		System.out.println(kia.getSpeed());
		
		
		Cafe cafe = new Cafe(30000,"엄청 비싼 커피");
		cafe.beverageInfo();
	}
}
