package java_inherit;

public class Student extends Person {
	private String school;
	
	/* 1. 자식 클래스의 생성자를 만든다고 해서 부모 클래스의 생성자를 꼭 만들어야 하는 것은 아님.
	 모든 클래스는 기본적으로 매개변수가 없는 기본 생성자를 가짐.
	 부모 클래스에서 생성자를 정의하지 않았다면 기본 생성자가 생성되고, 
	 자식 클래스에서 이 기본 생성자를 자동으로 호출
	 (super라는 키워드를 이용해서 접근하고 있는데 생략이 된 것)
	 
	 2. 부모 클래스에 매개변수가 있는 생성자가 존재할 경우(기본 생성자 아니고 직접 생성한 경우)
	  자식 클래스에서 명시적으로 부모 클래스의 생성잘르 호출해야함.
	  이 때! super() 메소드를 이용해서 생성자를 호출하는 것
	  */
	
	// 자식 클래스의 생성자에 부모의 멤버 변수 추가한 형태
	// 부모 클래스에 있는 생성자는 항상 명시 해주어야 함.
	public Student(String school, int age, String name){
		/* 부모 클래스에 매개변수가 있는 생성자를 만들었을 경우 생략되어 있는
		 * 채로 두면 빨간 줄이 뜨므로 (자식 생성자 매개변수, super 사용 시의 매개변수 둘다 고려)
		 * 순서에 맞게 super 키워드를 명시해주어야 함!
		*/
		super(name,age);
		
		// Student 클래스 안에 있는 멤버변수 school = 매개변수의 형태
		this.school = school;
		// super()키워드가 생략되어 있는 형태
		
//		부모에 매개변수가 있는 생성자가 없을 경우
//		setAge(age);
//		setName(name);
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	// 왜 toString이 자주쓰일까? (getter, setter은 이해가 가는데 toString의 쓰임새가
	// 우클릭 메뉴에 디폴트값 설정인 만큼 자주쓰이나 의문)
	@Override
	public String toString() {
		return "Student [학교명은=" + school + super.toString()+ "]";
	}
	
	
	
	
}
