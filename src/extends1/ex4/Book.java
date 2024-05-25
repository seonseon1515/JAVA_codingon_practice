package extends1.ex4;

public class Book extends Item{
    private String author;
    private String isbn;

    public Book(String name, int price, String author,String isbn){
        super(name, price);
        author = this.author;
        isbn = this.isbn;
    }

    @Override
    public void print() {
        // ctrl + o
        super.print();
        System.out.println("-저자: "+this.author + ", isbn" + isbn);
    }
}
