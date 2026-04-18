package DAY15;
import java.util.*;

public class Freq {
    public static void main(String[] args)
    {
        int[] array={1,2,3,1,1,1,2,4,3};
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:array)
        {
            map.put(i,map.getOrDefault(i, 0) + 1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            System.out.println(entry.getKey() + " existed " + entry.getValue() + " times");
        }
    }
}