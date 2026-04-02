package Ecommerce.service;

import Ecommerce.model.Order;

public class OrderService{
    public void placeOrder(Order order){
        System.out.println("User name : " +order.u.name);
        System.out.println("produt name : " + order.p.name);
        System.out.println("Quantity : " + order.quantity);
        double total;
        total = order.p.price * order.quantity;
        System.out.println("Total ammount : " + total);
    }
}