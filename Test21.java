import java.util.Scanner;
public class Test21 {
    public static void main(String [] args){
      /*   Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factor =1;
        int count =0;
        for(int i =1;i<=n;i++){
            factor*=i;
        }
        if(n==0 || factor%10!=0){
            System.out.print(0);
            return ;
        }
        int temp=factor;
        while(temp>0){
            if(temp%10!=0){
                break ;
            }
            count++;
            temp = temp/10;
        }
        System.out.println("The trailling Zeros are : "+ count); */

        int n = 14;
int count = 0;

for(int i = 5; i <= n; i *= 5){
    count += n / i;
}

System.out.println(count);
    }
}
