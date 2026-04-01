import java.lang.Math;

class Product {
    String name;
    int stock;
    int price;

    Product(String name, int stock, int price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
    }
}

class User {
    String name;
    String address;

    User(String name, String address) {
        this.name = name;
        this.address = address;
    }
}

class Order {
    Product pro;
    User use;
    int quantity;

    Order(Product pro, User use, int quantity) {
        this.pro = pro;
        this.use = use;
        this.quantity = quantity;
    }
}

class OutofStockException extends Exception {
    OutofStockException(String msg) {
        super(msg);
    }
}

class PaymentFailException extends Exception {
    PaymentFailException(String msg) {
        super(msg);
    }
}

class ProcessingFailException extends Exception {
    ProcessingFailException(String msg) {
        super(msg);
    }
}

class OrderService {   
    void PlaceOrder(Order order)
            throws OutofStockException, PaymentFailException, ProcessingFailException {

        if (order.pro.stock <= 0) {
            throw new OutofStockException("product out of stock");
        }

        if (Math.random() < 0.4) {
            throw new PaymentFailException("payment fail");
        }

        if (Math.random() < 0.2) {
            throw new ProcessingFailException("process fail");
        }

        order.pro.stock -= order.quantity;
        System.out.println("Order placed successfully");
    }
}

public class Task11 {
    public static void main(String[] args) {

        Product p = new Product("pant", 10, 1000);
        User j = new User("Abhijith", "6th cross street maharajanagar");
        Order u = new Order(p, j, 7);

        OrderService o = new OrderService();

        try {
            o.PlaceOrder(u);
        } catch (OutofStockException e) {
            System.out.println(e.getMessage());
        } catch (PaymentFailException e) {
            System.out.println(e.getMessage());
        } catch (ProcessingFailException e) {
            System.out.println(e.getMessage());
        }
    }
}