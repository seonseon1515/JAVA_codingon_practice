package access.ex;

public class Item {
    private String name;
    private int price;
    private int quantity;
    public Item(String name, int price, int quantity){
        this.name= name;
        this.price= price;
        this.quantity= quantity;
    }

    public String getName(){
        return name;
    }

    // 속성과 기능이 가까울 수록 좋음
    public int getTotalPrice(){
        return price* quantity;
    }

}
