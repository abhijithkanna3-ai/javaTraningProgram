class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

public class ManualException {

    void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is lesser than 18");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {
        ManualException obj = new ManualException(); // create object

        try {
            obj.checkAge(16);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}