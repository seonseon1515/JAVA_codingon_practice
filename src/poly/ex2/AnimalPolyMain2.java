package poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        // ctrl + alt + v : 객체 생성 단축키
        // ctrl + alt + N(변수 선언 된 부분 제거하고 합치는 명령어)
        Animal[] animalArr = {new Dog(), new Cat(), new Caw(), new Duck()};

        // 변하지 않는 부분(샷건 효과 고려)
        // iter 반복문 명령어
        for (Animal animal : animalArr) {
            // 범위 지정하면 메서드를 자동으로 만들어주는 명령어 ctrl + alt + M
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    // 부모는 자식을 담을 수 있다.


}
