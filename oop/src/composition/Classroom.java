package composition;

public class Classroom {
	
	private String roomName;
	// 객체의 컴포지션 - 우리가 만든 클래스도 하나의 자료형이 될 수 있음, 다른 클래스에 있는 것을 가져올 수 있음
	// 학생은 여러명이 올 수 있으므로 배열로 설정
	private Student[] students;
	
	// 매개변수의 이름은 위의 멤버 변수 이름과는 달라도 됨(다른 것)
	public Classroom(String room, Student[] stud) {
		this.roomName = room;
		this.students = stud;
	}
	
	public void print() {
		System.out.println("우리는 코딩온 "+ roomName + "기 입니다.");
		for( Student student: students) {
			// 배열 반복문 이용해서 출력
			student.print();
		}
	}
}
