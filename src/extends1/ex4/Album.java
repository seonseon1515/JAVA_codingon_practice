package extends1.ex4;

public class Album extends Item {
   private String artist;

   public Album(String name, int price, String artist){
       super(name, price);
       artist = this.artist;
   }

    @Override
    public void print() {
       // ctrl + o
        super.print();
        System.out.println("artist = " + artist);
    }
}
