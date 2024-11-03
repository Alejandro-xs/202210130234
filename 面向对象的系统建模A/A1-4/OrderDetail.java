package  A1_4;

public class OrderDetail {
    Order order;
    Product product;
    private int quantity;
    public double calculateSubTotal(){
        return product.getPriceForQuantity(quantity);
    }

    public double calculateWeight(){
        return product.getWeight()*quantity;
    }

}
