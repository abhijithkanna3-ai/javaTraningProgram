public class Exceptionclass{
    public static void main(String[] args){
        try{
            int a =8;
            int b =0;
            int c =a/b;
            System.out.println(c);
        }catch(ArithmeticException e){
            System.out.println("Number is divided by zero");
        }
        catch(Exception e){
            System.out.println(e);
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Finally block always execute");
        }
    } 
}