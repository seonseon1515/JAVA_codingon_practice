package final1;

public class Member {
    // final 은 매우 유용한 제약!!

    private final String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

//    public void changeData(String id, String name){
////        this.id = id; 컴파일 오류
//            this.name=name;
//    }

    public void print(){
        System.out.println("id: " + id + ", name: " + name);
    }
}
