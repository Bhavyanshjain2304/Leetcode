class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int targetOr = 0;
        for (int num : nums){
            targetOr |= num;
        }
        return rec(0,nums,0,targetOr);
    }
    public int rec(int index,int nums[],int curOr,int targetOr){
        if(index == nums.length){
            return (curOr == targetOr)? 1:0;
        }

        int pickCount = rec(index +1,nums, curOr | nums[index],targetOr);
        int noPickCount = rec(index +1,nums, curOr,targetOr);
        return pickCount +noPickCount;
    }
}