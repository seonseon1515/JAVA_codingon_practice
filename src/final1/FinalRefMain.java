package final1;

public class FinalRefMain {
    public static void main(String[] args) {
//        final Data data; // 참조형을 final로 선언
//        data = new Data();
//        위의 두줄의 코드와 같은 표현
        final Data data = new Data();

        // 참조 대상의 값은 변경 가능
        data.value = 10;
        data.value = 20;


    }
}
