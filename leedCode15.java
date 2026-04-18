Leetcode 387:

class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char ch: s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
    for(int i=0;i<s.length();i++)
    {
        char ch=s.charAt(i);
        if(map.get(ch)==1)
        {
            return i;
        }
    }
    return -1;
    }
}

Leetcode 169:

class Solution {
    public int majorityElement(int[] nums) 
    {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i, 0) + 1);
            if(map.get(i)>nums.length/2)
            {
                return i;
            }
        }
        return -1;
    }
}

Leetcode 383:

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:magazine.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:ransomNote.toCharArray())
        {
            if(!map.containsKey(ch)||map.get(ch)==0)
            {
                return false;
            }
            map.put(ch,map.get(ch)-1);
        }
        return true;

    }
}

Leetcode 242 (Using HashMap):

import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            if (!map.containsKey(c)) return false;

            map.put(c, map.get(c) - 1);

            if (map.get(c) == 0) {
                map.remove(c);
            }
        }
        return map.isEmpty();
    }
}
