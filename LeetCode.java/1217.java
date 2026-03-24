class Solution {
    public int minCostToMoveChips(int[] position) {
        int counte=0;
        int counto=0;
        for(int i=0;i<position.length;i++){
            if(position[i]%2==0){
                counte++;
            }
            else{
                counto++;
            }
        }
        if(counte>counto){
            return counto;
        }
        return counte;
    }
}