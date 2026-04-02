public Solution{
    public int [] leaders(int [] arr){
        int max=Interger.MIN_VALUE;
        int n = arr.length;
        int [] rev = new int[n];
        for(int i =n-1;i>=0;i--){
            int j =0;
            if(arr[i]>max){
                max=arr[i];
                j++;
            }
        }
        int result[]=new int [n];
        int l =rev.length-1;
        for(int i =0; i<rev.length;i++){
            result[i]=rev[l--];
        }
        return result;
    }
}