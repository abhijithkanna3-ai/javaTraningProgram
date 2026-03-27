import java.util.*;
public class String3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int [] arr = new int[26];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                arr[s.charAt(i)-'a']++;
            }
        }
        for(int j=0;j<26;j++){
            if(arr[j]==1){
                System.out.print((char)(j+'a') +":"+ (int)(j+'a'));
                break;
            }
        }
    }
}
