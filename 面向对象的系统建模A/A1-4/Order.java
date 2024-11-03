package a1_4;

import java.util.Date;
import java.util.List;

public class Order {
    private Date createDate;
    private String status;
    private Customer customer;
    private List<Product> productList;
    private Payment payment;
    public Order(Date createDate, String status, Customer customer, List<Product> productList, Payment payment) {
        this.createDate = createDate;
        this.status = status;
        this.customer = customer;
        this.productList = productList;
        this.payment = payment;
    }
    public Date getCreateDate() {
        return createDate;
    }
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public List<Product> getProductList() {
        return productList;
    }
    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
    public Payment getPayment() {
        return payment;
    }
    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
