package Ecommerce.model;

public class Order{
    public User u ;
    public Product p ;
    public int quantity;
    public Order(User u , Product p , int quantity){
        this.u=u;
        this.p=p;
        this.quantity=quantity;
    }
}