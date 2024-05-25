package extends1.ex4;

public class Movie extends Item {
    private String director;
    private String actor;

    public Movie(String name, int price, String director, String actor){
        super(name, price);
        director = this.director;
        actor = this.actor;
    }

    @Override
    public void print() {
        //ctrl + o
        super.print();
        System.out.println("director = " + director + " actor =  " + actor);
    }
}
