package hello.core.order;

public class Order {
    private Long memberId;
    private String itemNames;
    private int itemPrice;
    private int discountPrice;

    public Order(Long memberId, String itemNames, int itemPrice, int discountPrice) {
        this.memberId = memberId;
        this.itemNames = itemNames;
        this.itemPrice = itemPrice;
        this.discountPrice = discountPrice;
    }
    public int calculatorPrice(){
        return itemPrice - discountPrice;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getItemNames() {
        return itemNames;
    }

    public void setItemNames(String itemNames) {
        this.itemNames = itemNames;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "memberId=" + memberId +
                ", itemNames='" + itemNames + '\'' +
                ", itemPrice=" + itemPrice +
                ", discountPrice=" + discountPrice +
                '}';
    }
}
