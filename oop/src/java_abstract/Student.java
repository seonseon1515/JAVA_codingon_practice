package java_abstract;

public abstract class Student {
	private String name;
	private String school;
	private int age;
	private int studentId;
	
	// 생성자도 우클릭 메뉴 클릭하여 생성 가능
	public Student (String name, String school, int age, int studentId){
		this.name = name;
		this.school =school;
		this.age = age;
		this.studentId = studentId;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSchool() {
		return school;
	}


	public void setSchool(String school) {
		this.school = school;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	
	// 일반 메소드
	public void print() {
		System.out.println("====" + name +" 학생의 정보" +"====");
		System.out.printf("학교 : %s", school).println();
		System.out.printf("나이 : %d\n", age);
		System.out.printf("학번 : %s\n", studentId);
		System.out.printf("점심은, %s\n", todo());
		
	};
	
	public abstract String todo();
}
