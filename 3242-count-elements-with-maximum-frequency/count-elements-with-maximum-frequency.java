class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int count = 0;

        for(int i = 0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            max = Math.max(entry.getValue(),max);
        }

        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            if(entry.getValue() == max) count+= entry.getValue();
        }
        return count;

    }
}