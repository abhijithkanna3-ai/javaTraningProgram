
Leetcode 771 (My logic):

class Solution {
    public int numJewelsInStones(String jewels, String stones) 
    {
        int count=0;
        char[] j= jewels.toCharArray();
        char[] s=stones.toCharArray();
        for(int i=0;i<j.length;i++)
        {
            for(int k=0;k<s.length;k++)
            {
                if(j[i]==s[k]) count++;
            }
        }
        return count;  
    }
}

Leetcode 771 (Using Set):

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> s=new HashSet<>();
        for(char c:jewels.toCharArray())
        {
            s.add(c);
        }
        int count=0;
        for(char c:stones.toCharArray())
        {
            if(s.contains(c)) count++;
        }
        return count;

    }
}

Leetcode 1832:

class Solution {
    public boolean checkIfPangram(String sentence) {
        for(char ch='a';ch<='z';ch++)
        {
            if(sentence.indexOf(ch)==-1)
            {
                return false;
            }
        }
        return true;
    }
}


Leetcode 452:

class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points.length==0)
        {
            return 0;
        }
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int arrows=1;
        int end=points[0][1];
        for(int i=1;i<points.length;i++)
        {
            if(points[i][0]>end)
            {
                arrows++;
                end=points[i][1];
            }
        }
        return arrows;
        
    }
}

Leetcode 819:

Leetcode 455: