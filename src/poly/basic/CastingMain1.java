package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        // 부모 변수가 자식 인스턴스를 담을 수 있음. 부모는 마음이 넓기 때문에 자식을 담을 수 있다!로 쉽게 암기
        Parent poly = new Child();

        // 단 자식의 기능은 호출 불가, 컴파일 오류
        // poly.childMethod();

        // 다운 캐스팅(부모타입 -> 자식 타입)
        Child child = (Child) poly;
        child.childMethod();
    }
}
