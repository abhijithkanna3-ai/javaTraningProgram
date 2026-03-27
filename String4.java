public class String4 {
    public static void main(String[] args) {

        String s = "hellooo";
        int n = s.length();

        int left = 0;
        int right = n - 1;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (j == 0) {
                    System.out.print(s.charAt(left++));
                }
                else if (i <= n / 2 && j == n - i - 1) {
                    System.out.print(s.charAt(right--));
                }
                else if (i > n / 2 && j == i) {
                    System.out.print(s.charAt(right--));
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
