package poly.ex2;

public class AnimalPolyMain {
    public static void main(String[] args) {
        // ctrl + alt + v : 객체 생성 단축키
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal caw = new Caw();
        Animal duck = new Duck();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
        soundAnimal(duck);
    }

    // 부모는 자식을 담을 수 있다.
    private static void soundAnimal(Animal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound(); // 자식에서 오버라이딩 된 메서드가 우선권을 가져서 실행됨
        System.out.println("동물 소리 테스트 종료");
    }
}
