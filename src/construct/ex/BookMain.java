package construct.ex;

public class BookMain {
    public static void main(String[] args) {
        // 기본 생성자 사용 -> 생성자 오버로딩을 사용해서 생성자를 만드는 경우 기본 생성자를 자바가
        // 자동으로 생성해주지 않으므로 직접 기본 생성자를 만들어야 함
        Book book1 = new Book();
        book1.displayInfo();

        Book book2 = new Book("flyBook","seonk");
        book2.displayInfo();

        Book book3 = new Book("topBook","seonk2",23423);
        book3.displayInfo();

    }
}
