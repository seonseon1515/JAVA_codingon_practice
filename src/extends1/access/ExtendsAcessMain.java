package extends1.access;

import extends1.access.child.Child;
import extends1.access.parent.Parent;

public class ExtendsAcessMain {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = new Parent();
        child.call();
        parent.printParent();
    }
}
