import java.util.ArrayList;
import java.util.Arrays;
public class Collection1{
    public static void main(String [] args){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,1,1,1,1,2,2,3));
        for(int i =0 ;i<arr.size();i++){
            int temp =arr.get(i);
            for(int j =i+1;j<arr.size();j++){
                if(temp == arr.get(j)){
                    arr.remove(j);
                    j--;
                }
            }
        }

        for(int i =0;i<arr.size();i++){
            System.out.print(arr.get(i)+ " ");
        }

    }
}