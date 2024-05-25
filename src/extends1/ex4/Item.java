package extends1.ex4;

public class Item {
    private String name;
    private int price;

    public Item(String name, int price){
        name = this.name;
        price = this.price;
    }
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void print(){
        System.out.println("name = " + name + "price = " + price);
    }
}
