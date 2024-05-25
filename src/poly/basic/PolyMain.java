package poly.basic;

public class PolyMain {

    public static void main(String[] args) {
        // 부모 변수악 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod(); // 상속 받은 기능
        child.childMethod();

        // 부모 변수가 자식 인스턴스 참조(= 다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child(); // 자식을 부모에 대입(부모 타입에 자식 타입 담기)
        poly.parentMethod();

//        Child child1 = new Parent(); -> 컴파일 오류

//        자식의 기능은 호출 불가
//        poly.childMethod(); -> parent 타입이기 때문에 호출 불가

    }
}
