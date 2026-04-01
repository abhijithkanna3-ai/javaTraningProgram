import java.util.*;
public class DailyTest31 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a =sc.nextInt();
        int[] arr = new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }

        int start = 0;
        int end = 0;
        int sizel = 0;
        int sizer = 0;
        int max = 0;
        int first = 0;
        int last = 0;

        for (int i = 0; i < arr.length; i++) {   // ✔ fixed
            start = i;
            sizel = 1;
            sizer = 0;

            for (int j = i + 1; j < arr.length; j++) {   // ✔ fixed

                if ((arr[j] > arr[j - 1]) && sizer == 0) {
                    end = j;
                    sizel++;
                }
                else if ((arr[j] < arr[j - 1]) && (sizel >= 2 && sizel > sizer)) {
                    end = j;
                    sizer++;
                }
                else if ((sizel > 1 && sizer > 0) && (arr[j] > arr[j - 1])) {
                    break;
                }
            }

            if ((sizel + sizer) > max) {
                max = sizel + sizer;
                first = start;
                last = end;
            }
        }

        if (max == 0) {
            return;   // ✔ fixed
        }

        int[] result = new int[max];

        for (int i = 0; i < max; i++) {
            result[i] = arr[first++];   // ✔ fixed
        }

        for (int j = 0; j < max; j++) {
            System.out.print(result[j] + " ");
        }
    }
}