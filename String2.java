import java.util.*;
public class String2{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<s.length();i++){
            int count =0;
            if(s.charAt(i)!=' '&& (i==0||s.charAt(i-1)==' ')){
                StringBuilder temp = new StringBuilder();
                while(i<s.length() &&s.charAt(i)!=' ' ){
                    count++;
                    temp.append(s.charAt(i));
                    i++;
                }
                if(count%2==0){
                   if( sb.length()>0){ sb.append(' ');}
                    sb.append(temp);
                  
            }
              i--;  
        }
        
        }
        System.out.print(sb.toString());
}
}