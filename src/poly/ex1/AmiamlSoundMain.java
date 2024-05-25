package poly.ex1;

public class AmiamlSoundMain {

    public static void main(String[] args) {
        // 인스턴스 생성 단축키 ctrl + alt + v
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

//        배열로 중복 제거 시도.. 실패
//        Caw[] caaArr = {cat , cat, caw};

        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");

        soundCaw(caw);
        soundCat(cat);
//        System.out.println("동물 소리 테스트 시작");
//        caw.sound();
//        System.out.println("동물 소리 테스트 종료");

    }

    // 출력 코드 중복 문제 해결 시도!!
    private static void soundCaw(Caw caw){
        System.out.println("동물 소리 테스트 시작");
        caw.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void soundCat(Cat cat){
        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    // 코드 중복 문제 -> 타입이 달라서 중복 제거 실패

}
