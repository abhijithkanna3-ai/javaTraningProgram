public class Wapperclass{
    public static void main(String [] args){
        Integer b = Integer.valueOf(1);
        Integer c = Integer.valueOf(147);
        Integer a =Integer.parseInt("142");
        System.out.println(b==c);
        if(b.equals(c)){
            System.out.print(a+b);
        }
    }
}