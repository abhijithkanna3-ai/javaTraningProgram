import java.io.*;

class Book implements Serializable {
    String title;
    int price;
}

public class rough {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Writing (Serialization)
        Book s = new Book();
        s.title = "Java programming";
        s.price = 1000;

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.txt"));
        oos.writeObject(s);
        oos.close();

        // Reading (Deserialization)
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.txt"));
        Book b = (Book) ois.readObject();
        ois.close();

        System.out.println(b.title + " " + b.price);
    }
}