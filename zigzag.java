public class zigzag{
    public static void main(String [] args){
        String s ="PAYPALISHIRING";
        int raws = 3;
        StringBuilder[] sb = new StringBuilder[raws];

        for(int i =0;i<raws;i++){
            sb[i]=new StringBuilder();
        } 
        int current =0;
        boolean down = false;
        for(int i =0;i<s.length() ;i++){
            sb[current].append(s.charAt(i));
            if(current ==0 || current == raws-1){
                down =!down;
            }
            current +=down?1:-1;
        }
        StringBuilder result = new StringBuilder();
        for(StringBuilder row : sb){
            result.append(row);
        }
        System.out.print(result.toString());
    }
}