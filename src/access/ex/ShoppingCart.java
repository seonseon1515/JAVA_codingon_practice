package access.ex;

public class ShoppingCart {
   private Item[] items = new Item[10];
   private int itemCount;

   public void addItem(Item item){
    if(itemCount>= items.length){
        System.out.println("장바구니가 가득 찼습니다.");
        return;
    }
    // else 문을 써도 되지만 뎁스가 더 들어가는 부분때문에 진짜 로직이 어딘지 잘 모를 수 있음
   // 이프문은 제약 조건일 뿐임 진짜 로직은 아래 카트에 아이템을 담는 부분
       items[itemCount] = item;
       itemCount++;
          }

   public void displayItem(){
       System.out.println("장바구니 상품 출력");
       for(int i = 0 ; i < itemCount ; i++){
           Item item = items[i]; // 아이템을 꺼냄
           System.out.println("상품명: " + item.getName()+" 합계:" + item.getTotalPrice());
       }
       System.out.println("전체 가격 합:" + calculateTotalPrice());
   }

   private int calculateTotalPrice() {
       int totalPrice =0;
       for(int i = 0 ; i<itemCount;i++){
           Item item = items[i];
           totalPrice += item.getTotalPrice();
       }
       return totalPrice;
   }

}
