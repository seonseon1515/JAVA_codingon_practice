package poly.basic;

public class CastingMain3 {



    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = (Parent) child; // 업캐스팅은 생략가능, 생략 권장(런타임 오류 발생하지 않음)
        Parent parent2 = child;

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
