class Solution {
    public int hammingWeight(int n) {
        int count = 0;          // stores number of 1s

        while (n != 0) {        // loop until all bits become 0
            n = n & (n - 1);    // remove one 1 bit
            count++;            // increment count
        }

        return count;           // return total number of 1s
    }
}