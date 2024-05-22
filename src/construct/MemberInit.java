package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    // 추가
    void initMember (String name, int age, int grade){
        // 이름이 똑같은 두 변수의 이름을 구별하는 방법
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
