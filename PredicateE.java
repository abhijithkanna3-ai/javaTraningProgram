import java.util.function.Predicate;

public class PredicateE {
    public static void main(String [] args){
        Predicate<String> isEven = x ->x.charAt(0)=='a'||x.charAt(0)=='A';
        System.out.print(isEven.test("ben"));
    }
}
