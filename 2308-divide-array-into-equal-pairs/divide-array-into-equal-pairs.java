class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int num : nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }

        for(int freq : mp.values()){
            if((freq&1) == 1) return false;
        }
        return true;
    }
}