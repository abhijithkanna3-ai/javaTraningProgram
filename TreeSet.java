package DAY15;

import java.util.*;
public class Treeset {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        TreeSet<Integer> Tset=new TreeSet<Integer>();
        int[] arr={5,6,9,1,7,2};
        for(int i:arr)
        {
            Tset.add(i);
        }
        //System.out.println("TreeSet: " + Tset);
    
    int target =sc.nextInt();
    int low=Tset.ceiling(target);
    int high=Tset.floor(target);
    int lower=Tset.lower(target);
    int higher=Tset.higher(target);
    System.out.println("Ceiling: " + low);
    System.out.println("Floor: " + high);
    System.out.println("Lower: " + lower);
    System.out.println("Higher: " + higher);
    }
}