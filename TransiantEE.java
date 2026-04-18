import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Address{
    String address;
}
class Student implements Address {
    String name;
    
}


public class TransiantEE {
    public static void main(String [] args){
        Student s = new Student();
        s.name = "abi";
        s.address ="no 3 , omr chennai";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("address.txt"));
        oos.writeObject(s);
        oos.close();

        ObjectInputStream oob = new ObjectInputStream(new FileInputStream("address.txt"));
        Student h = (Student) oob.readObject();
        System.out.println(oob);
    }
}
