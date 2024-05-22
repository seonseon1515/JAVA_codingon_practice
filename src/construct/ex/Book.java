package construct.ex;

public class Book {
    String title; // 제목
    String author; // 저자
    int page; // 페이지 수

    // Ex1) todo 코드를 완성하세요.
    Book(){
       this("","",0);
    }

    Book(String title, String author, int page){
        // 아래의 코드와 중복을 제거하는 것(다른 오버로딩 생성자에서 this. 사용)
        this.title = title;
        this.author = author;
        this.page = page;
    }

    Book(String title, String author){
        this(title,author,0);// 중복 제거
//        this.title = title;
//        this.author = author;
    }

    // Book 클래스의 메서드
    void displayInfo(){
        System.out.println("제목: " + title +  ", 저자: " +author + ", 페이지: " + page);
    }
}
