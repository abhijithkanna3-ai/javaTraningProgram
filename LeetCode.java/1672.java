class Solution {
    public int maximumWealth(int[][] accounts) {
        int currentsum=0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
            for(int j =0;j<accounts[i].length;j++){
                currentsum+=accounts[i][j];
            }
            if(currentsum>max){
                max=currentsum;
            }
            currentsum=0;
        }
        return max;
    }
}