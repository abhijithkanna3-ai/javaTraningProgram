import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {

        // 1. Basic Consumer using lambda
        Consumer<String> c = (s) -> System.out.println(s);

        c.accept("Hello from Consumer");

        // 2. Consumer with block (multiple statements)
        Consumer<String> c2 = (s) -> {
            System.out.println("Received: " + s);
            System.out.println("Length: " + s.length());
        };

        c2.accept("Java");

        // 3. Using method reference (shortcut)
        Consumer<String> c3 = System.out::println;
        c3.accept("Using method reference");

        // 4. Chaining Consumers
        Consumer<String> upper = (s) -> System.out.println(s.toUpperCase());
        Consumer<String> lower = (s) -> System.out.println(s.toLowerCase());

        Consumer<String> combined = upper.andThen(lower);
        combined.accept("Abhujith");
    }
}