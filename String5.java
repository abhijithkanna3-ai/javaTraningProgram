public class String5 {
    public static void main(String [] args){
    String s="pan";
    int n = 3;
    int first = n +(n-2);
    int second =0;
    int step=0;
    StringBuilder sb = new StringBuilder();
    for(int i =0 ;i<s.length();i++){
        step=i+first;
        for(int j =0 ; j<s.length();j++){
            if(i==j){
                sb.append(s.charAt(j));
            }
            else if(j==step){
                sb.append(s.charAt(j));
                j+=step;
                first-=2;
                if(second!=0){
                    sb.append(s.charAt(j+second));
                    j+=second;
                    second +=2;
                }

            }
            j--;
        }

    }
    System.out.print(sb.toString());

    }
}
