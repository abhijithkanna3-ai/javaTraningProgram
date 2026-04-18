Leetcode 48:

class Solution {
    public void rotate(int[][] matrix) 
    {
        int n=matrix.length;
        int[][] ans =new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                ans[j][n-1-i]=matrix[i][j];
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j]=ans[i][j];
            }
        }   
    }
}

Leetcode 217:

class Solution {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set=new HashSet<>();
        for(int i:nums)
        {
            if(set.contains(i))
            {
                return true;
            }
            set.add(i);
        
    }
    return false;
    }}

Leetcode 268:

class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums)
        {
            set.add(i);
        }
        for(int i=0;i<=nums.length;i++)
        {
            if(!set.contains(i))
            {
                return i;
            }
        }
        return -1;
        
    }
}