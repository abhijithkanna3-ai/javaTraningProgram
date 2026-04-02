package Ecommerce.main;

import Ecommerce.model.*;
import Ecommerce.service.*;
import java.util.*;
public class Main{
    public static void main(String [] args){
        User user = new User("abi","Tirunelveli");
        Product product = new Product("shirt",500);
        Order order = new Order(user , product,5);
        OrderService service  = new OrderService();
        service.placeOrder(order);
    }
}