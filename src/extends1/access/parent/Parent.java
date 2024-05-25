package extends1.access.parent;

public class Parent {

    public int publicValue;
    protected int protectedValue;
    int defaultValue;
    private int privateValue;

    public void publicMethod(){
        System.out.println("Parent.publicMehtod");
    }

    protected void protectedMethod(){
        System.out.println("Parent.protectedMehtod");
    }

    void defualtMethod(){
        System.out.println("Parent.defaultMehtod");
    }

    private void privateMethod(){
        System.out.println("Parent.privateMehotd");
    }

    public void printParent(){
        // soutv
        System.out.println("====Parent 메서드 안 ====");
        System.out.println("publicValue = " + publicValue);
        System.out.println("protectedValue = " + protectedValue);
        System.out.println("defaultValue = " + defaultValue);
        System.out.println("privateValue = " + privateValue);

        // 부모 메서드 안에서 모두 접근 가능
        defualtMethod();
        privateMethod();
    }
}
