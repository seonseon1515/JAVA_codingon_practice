package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 생성자 추가, 오버로딩
    MemberConstruct(String name, int age){
        this(name,age,50); // this 활용하여 변경함으로써 아래의 중복 제거(생성자 코드 안에서 첫줄 작성)
//        this.name = name;
//        this.age= age;
//        this.grade=50;
    }
    MemberConstruct(String name, int age, int grade){
        System.out.println("생성자 호출 name="+name+", age="+age+", grade="+grade);
        this.name = name;
        this.age = age;
        this.grade = grade;

    }
}
