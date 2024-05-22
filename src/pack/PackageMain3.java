package pack;
// 폴더를 사용하면 되는데 왜 굳이 패키지라는 것이 필요하지??????등등의 근본적인 것의 사용부터의 의문을 해결하기 힘들었다


// 다른 패키지의 같은 이름의 클래스를 사용할 때 자주 사용하는 패키지는 임포트 하는 경우가 편함
import pack.a.User;
import pack.a.User2;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA= new User();
        pack.b.User userB = new pack.b.User();


    }
}
