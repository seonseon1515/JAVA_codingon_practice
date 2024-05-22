package final1;

public class ConstantMain1 {

    public static void main(String[] args) {
        // 협업에서 개발은 의사소통이다.
        // 1000이라는 숫자를 다른 개발자가 봤을 때 어떤 건지 아나? -> 매직넘버(나를 놀라게 하는 숫자)
        // 1000 보다는 상수(여러 군데서 같이 쓰는 고정된 값)를 쓰는 것이 좋음

        System.out.println("프로그램 최대 참여자 수" +  1000);
        int currentUserCount = 999;
        // 후위증감 연산자
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    private static void process(int cureentUserCount){
        System.out.println("참여자 수 :" + cureentUserCount);
        if(cureentUserCount > 1000){
            System.out.println("대기자로 등록합니다.");
        } else {
            System.out.println(" 게임에 참여합니다.");
        }
    }
}
