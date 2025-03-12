class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int end = n-1;
        int negPos = binarySearch(nums,0,end,-1);
        int posPos = binarySearch(nums,negPos,end,0);
        int posCount = (n-posPos);
        return Math.max(posCount,negPos);
    }
    public int binarySearch(int[] nums,int start,int end,int target){
        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] <= target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return start;
    }
}