public class plan{
    public static void main(String [] args){
        String ch = "how   are   you";
        int count =0;
        for(int i =0;i<ch.length();i++){
            if(i !=ch.length()-1){
            if((ch.charAt(i)!= ' ' && ch.charAt(i+1)==' ')||(ch.charAt(i)!=' ' && i+1 ==ch.length())){
                count++;
            }
        }

        }
        System.out.print(count);
    }

}