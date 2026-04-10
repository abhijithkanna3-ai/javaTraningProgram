public class String5 {
    public static void main(String[] args) {

        String s = "PAYPALISHIRING";
        int numRows = 3;

        if (numRows == 1) {
            System.out.println(s);
            return;
        }

        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int cycle = 2 * numRows - 2;

        for (int i = 0; i < numRows; i++) {

            for (int j = i; j < n; j += cycle) {

                // vertical element
                sb.append(s.charAt(j));

                // diagonal element (skip first and last row)
                int diag = j + cycle - 2 * i;
                if (i != 0 && i != numRows - 1 && diag < n) {
                    sb.append(s.charAt(diag));
                }
            }
        }

        System.out.println(sb.toString());
    }
}