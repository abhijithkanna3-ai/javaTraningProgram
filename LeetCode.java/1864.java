class Solution {
    public String maximumOddBinaryNumber(String s) {
        StringBuilder once = new StringBuilder();
        StringBuilder zero = new StringBuilder();
        boolean save = false;
        for(char ch :s.toCharArray()){
            if(ch=='1'){
                if(!save){
                    save=true;
                }
                else{
                once.append(ch);
                }
            }
            else{
                zero.append(ch);
            }
        }
    return once.append(zero).append("1").toString();
    }
}