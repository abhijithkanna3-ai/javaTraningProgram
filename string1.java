//*this is the 26th test problem in class */
import java.util.*;
public class string1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder b = new StringBuilder();
        StringBuilder n = new StringBuilder();
        for(int i =0;i<s.length();i++){
            if(i%2==0){
                b.append(s.charAt(i));
            }
            else{
                n.append(s.charAt(i));
            }
        }
        String r =b.append(n).toString();
        System.out.print(r);
        
    }
}