class Solution {
    int lastRemaining(int n) {
        int start =1;
        int steps =1;
        int remaining = n;
        boolean left = true ;
        while(remaining>1){
            if(left||remaining%2==1){
                start+=steps;
            }
            remaining/=2;
            steps*=2;
            left=!left;
        }
        return start;
    }
};