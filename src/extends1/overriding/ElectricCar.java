package extends1.overriding;

public class ElectricCar extends Car {

    // 어노테이션: 프로그램이 읽을 수 있는 주석
    @Override
    public void move(){
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge(){
        System.out.println("충전합니다.");
    }


}
