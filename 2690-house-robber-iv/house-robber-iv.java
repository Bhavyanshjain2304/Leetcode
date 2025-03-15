class Solution {
    public int minCapability(int[] nums, int k) {
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for(int num : nums){
            if(num<low) low = num;
            if(num>high) high = num;
        }
        // 2 to 9 can be the range of our answer for binary Search
        int ans = high;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(isRobberyPossible(mid,nums,k)){
                ans = mid;
                high = mid-1;
            }else low = mid+1;
        }
        return ans;
    }
    public boolean isRobberyPossible(int capacity, int[] nums, int minHouses){
        int houseRobbed = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] <= capacity){
                houseRobbed++;
                i++;
            }
            if(houseRobbed >= minHouses) return true;
        }
        return false;
    }
}