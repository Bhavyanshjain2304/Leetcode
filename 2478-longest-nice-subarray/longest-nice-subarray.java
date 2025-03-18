class Solution {
    public int longestNiceSubarray(int[] nums) {

        int start = 0;
        int bitMask = 0;
        int maxLen = 1;
        for(int end = 0;end<nums.length;end++){
            // shrinking
            while((bitMask & nums[end]) != 0){
                bitMask ^= nums[start];
                start++;
            }
            bitMask |= nums[end];
            maxLen = Math.max(maxLen, end-start+1);
        }
        return maxLen;
    }
}