public class Task11 {

    public static int[] leaders(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;

        int[] temp = new int[n];
        int k = 0;

        // Find leaders from right
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                temp[k++] = arr[i];
            }
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = temp[k - i - 1];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};

        int[] result = leaders(arr);

        System.out.print("Leaders: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}