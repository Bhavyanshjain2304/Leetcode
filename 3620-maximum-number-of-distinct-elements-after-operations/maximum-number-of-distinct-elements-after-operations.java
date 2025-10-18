class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        // int n = nums.length;
        Arrays.sort(nums);
        int current = Integer.MIN_VALUE;
        int count = 0;
        for(int n : nums){
            int low = n-k;
            int high = n+k;
            if(current+1 <= high){
                int temp = Math.max(current+1,low);
                current = temp;
                count++;
            }
        }
        return count;

    }
}