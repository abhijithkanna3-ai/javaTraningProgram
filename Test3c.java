public class Test3c {
    public static void main(String[] args) {
        String[] s = {"flower", "fly", "fload"};
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s[0].length(); i++) {
            char ch = s[0].charAt(i);
            boolean curr = true;

            for (int j = 0; j < s.length; j++) {
                if (i >= s[j].length() || ch != s[j].charAt(i)) {
                    curr = false;
                    break;
                }
            }

            if (curr) {
                sb.append(ch);
            } else {
                break;
            }
        }

        System.out.println(sb.toString());
    }
}//good 
