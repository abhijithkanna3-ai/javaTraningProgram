import java.util.*;
class Product implements Comparable<Product>{
    String name ;
    int price;
    double roting;
    public Product(String name , int price , double roting ){
        this.name = name;
        this.price = price;
        this.roting = roting ;
    }
    @Override
    public int compareTo(Product p){
        return this.price -p.price;
    }
    @Override
    public String toString(){
        return name + " " + price;
    }
}
public class Task14 {
    public static void main(String [] args){
    List<Product>  product = new ArrayList<>();      

    product.add(new Product("shirt", 1000 , 3));
        product.add(new Product("pant", 1500 , 4));
        product.add(new Product("shoes", 5000 , 3));

    Comparator<Product> byprice = new Comparator<Product>(){
        public int compare(Product a , Product b){
            return Integer.compare(a.price , b.price);
        }
    };

    Collections.sort(product, byprice);
    for(Product p:product ){
        System.out.println(p);
    }
    }
}
