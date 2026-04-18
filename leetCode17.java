Leetcode 347:

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freq=new HashMap<>();
        for(int i:nums)
        {
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(freq.entrySet());
        Collections.sort(list,(a,b)->b.getValue()-a.getValue());
        int[] result=new int[k];
        for(int i=0;i<k;i++)
        {
            result[i]=list.get(i).getKey();
        }
        return result;
}}

Leetcode 560 (Brute-force method):

class Solution {
    public int subarraySum(int[] nums, int k) 
    {
        int count=0;
        for(int start=0;start<nums.length;start++)
        {
            int sum=0;
            for(int j=start;j<nums.length;j++)
            {
                sum+=nums[j];
                if(sum==k)
                count++;
            }
        }
        return count;
    }
}
