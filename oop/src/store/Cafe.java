package store;

public class Cafe {
	// 변수 (멤버 변수, 필드, 데이터)
	private int price;
	private String sort;
	
	// 생성자
	public Cafe(int price, String sort) {
		this.price = price;
		this.sort = sort;
	}
	
	// 메소드
	public void beverageInfo(){
		System.out.println("음료의 종류는 " + sort + ", 음료의 가격은 "+price+"입니다.");
	}
}
