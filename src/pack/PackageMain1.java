package pack;

public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data();
        
        // 자신이랑 다른 패키지 일 경우 패키지 명까지 써야 함.
        pack.a.User user = new pack.a.User();
    }
}
