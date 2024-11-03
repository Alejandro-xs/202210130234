package A1_4;

public class Product {
    private String title;        
    private double weight;       
    private String description;  
    private double price;        
    public double getPriceForQuantity(int quantity) {
        return price * quantity;
    }
    public double getWeight() {
        return weight;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
