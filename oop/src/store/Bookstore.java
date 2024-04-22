package store;

public class Bookstore {
	
	// 변수(필드, 데이터, 멤버 변수 등으로 칭함)
	// 멤버 변수는 일반적으로 private를 통해 가려놓아야 함
	private String name;
	private int books;
	
	
	// 생성자 - 이름은 클래스와 똑같게
	// 할당을 통해 항상 생성자를 받아야 하는 클래스가 됨
	// 매개변수에 클래스가 올 수도 있음 -> 객체 컴포지션
	public Bookstore(String name, int books) {
		this.books = books;
		this.name = name;
	}
	
	// 메소드
	public void print(){
		System.out.println("서점명은 "+name+", 책 수량은 " +books);
	}
	
}
