import java.util.*;
class Calculator{
    int add(int a , int b){
        return a +b;
    }

    int addThree(int a ,int b , int c){
        return a+b+c;
    }

    double adddacimal(double a , double b){
        return a+b;
    }
}

public class addtion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double f = sc.nextInt();
        double g = sc.nextInt();
        Calculator k = new Calculator();

        System.out.print(k.add(a,b));
    }
}
