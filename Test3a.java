/* QUESTION : 1.find the no of posible subarray that sum is divisible by k :
I/P =[4,5,0,-2,-3,1]
O/P =7
 */
public class Test3a {
    public static void main(String[] args) {
        int[] arr = {4, 5, 0, -2, -3, 1};
        int k = 5;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum % k == 0) {
                    count++;
                }
            }
        }

        System.out.print(count);
    }
}