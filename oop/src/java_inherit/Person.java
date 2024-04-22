package java_inherit;

// 생성자가 없으므로 super()가 생략된 형태임
public class Person extends Object {
	private int age;
	private String name;
	
	/*
	public Person() {
		// 기본 생성자 형태가 항상 생략되어 존재하고 있음
	}
	*/
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// getter, setter
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	// 마우스우클릭 -> source -> toString 
//	@Override  -> 부모클래스의 메소드에서 내용만 재정의
	// 부모한테 상속 받음을 명시적으로 알려주기 위하여 일반적으로 표시 -> Override 어노테이션
//	public String toString() {
//		return "Person [toString()=" + super.toString() + "]";
//	}
	
	public String toString() {
		return "사람 이름은 " + name + "나이는 " + age+ "입니다.";
	}
	
	

}
