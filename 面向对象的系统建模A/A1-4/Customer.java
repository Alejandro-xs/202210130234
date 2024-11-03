package A1_4;

public class Customer {
    private String name;
    private String contact;
    private String deliveryAddress;
    private String active;
    public Customer(String name, String contact, String deliveryAddress, String active) {
        this.name = name;
        this.contact = contact;
        this.deliveryAddress = deliveryAddress;
        this.active = active;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    public String getDeliveryAddress() {
        return deliveryAddress;
    }
    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
    public String getActive() {
        return active;
    }
    public void setActive(String active) {
        this.active = active;
    }
}
