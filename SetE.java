package DAY14;
import java.util.*;
public class SetE {
    public static void main (String[] args)
    {
        Set<Integer> Linkedset=new LinkedHashSet<>();
        Set<Integer> Hset=new HashSet<>();
        int[] arr={5,6,9,1,7,2};
        for(int i:arr)
        {
            Linkedset.add(i);
            Hset.add(i);
        }
        System.out.println("LinkedHashSet: " + Linkedset);
        System.out.println("HashSet: " + Hset);

    }
    
}