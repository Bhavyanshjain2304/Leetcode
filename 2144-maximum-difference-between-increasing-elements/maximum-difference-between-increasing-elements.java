class Solution {
    public int maximumDifference(int[] nums) {
        int ans = -1;
        int min = nums[0];

        for(int i = 1;i<nums.length;i++){
            min = Math.min(min,nums[i-1]);
            if(min < nums[i]){
                int temp = nums[i]-min;
                ans = Math.max(temp,ans);
            }
        }
        return ans;
    }
}