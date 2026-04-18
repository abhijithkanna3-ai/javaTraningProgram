Leetcode 56:

class Solution {
    public int[][] merge(int[][] intervals) {
        Comparator<int[]> byZerothIndex=new Comparator<int[]>()
        {
            public int compare(int[] a,int[] b)
            {
                return Integer.compare(a[0],b[0]);
            }
        };
        Arrays.sort(intervals,byZerothIndex);
        List<int[]> result=new ArrayList<>();
        for(int i=0;i<intervals.length;i++)
        {
            int[] current=intervals[i];
            if(result.isEmpty()||result.get(result.size()-1)[1]<current[0])
            {
                result.add(current);
            }
            else
            {
                int[] merge=result.get(result.size()-1);
                merge[1]=Math.max(merge[1],current[1]);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}

Leetcode 349:

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
Set<Integer> set=new HashSet<>();
Set<Integer> result=new HashSet<>();

for(int i:nums1)
{set.add(i);}
for(int i:nums2)
{
if(set.contains(i))
result.add(i);
}
int[] ans=new int[result.size()];

int x=0;

for(int i:result)
{
ans [x++]=i;
}

return ans;
}}