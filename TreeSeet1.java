package DAY15;
import java.util.*;
public class TreeSet1 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        TreeSet<Integer> Tset=new TreeSet<>();
        int[] arr={5,6,9,1,7,2};
        for(int i:arr)
        {
            //Linkedset.add(i);
            Tset.add(i);
        }
        int target=sc.nextInt();
        Integer lower =Tset.lower(target);
        Integer higher=Tset.higher(target);
        int result=0;
        if(lower==null)
        {
            result=higher;
        }
        else if(higher==null)
        {
            result=lower;
        } 
        else
        {
            int diff1=target-lower;
            int diff2=higher-target;
            if(diff1<=diff2)
            {
                result=lower;
            }
            else
            {
                result=higher;
            }
        }
        System.out.println(result);

    }    
}