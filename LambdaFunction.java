interface Math{
    int addI(int a , int b );
}


interface Output{
    void SayHello();
}
public class LambdaFunction{
    
    public static void main(String [] args){

        Math addMath = (a,b)->{
           System.out.println("add");
            return a+b;

        };
          /*   @Override
        public int addI(int a  ,int b){
            return a+b;
        }
        }; */
        Output n = ()-> System.out.println("hello");
        System.out.println(addMath.addI(13,1));
        n.SayHello();

    }
}