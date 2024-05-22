package access.a;

public class AccessData {
//    public static void main(String[] args) {
//        AccessData data3 = new AccessData();
//        data3.privateMethod();
//    private 의 경우 해당 접근 제어자를 만든 클래스 내부에서만 사용 가능
//    }
    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod(){
        System.out.println("publicMethod 호출 " + publicField);
    }

    public void defaultMethod(){
        System.out.println("defaultMethod 호출 " + defaultField);
    }
    private void privateMethod(){
        System.out.println("privateMethod 호출 " + privateField );
    }

    public void innerAccess(){
        System.out.println("내부 호출");
        publicField =100;
        defaultField = 200;
        privateField = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
