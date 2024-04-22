package java_abstract;

public class Kim extends Student {
	
	
	// 마우스 우클릭으로 생성자 생성 가능
	public Kim(String name, String school, int age, int studentId) {
		super(name, school, age, studentId);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String todo() {
		return "김가네 김밥";
	}

}
