class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int num : nums){
            mp.put(num,mp.getOrDefault(num,0) +1);
        }

        List<Map.Entry<Integer,Integer>> entryList = new ArrayList<>(mp.entrySet());

        entryList.sort((a,b) -> b.getValue() - a.getValue());
        int[] result = new int[k];

        for(int i = 0;i<k;i++){
            result[i] = entryList.get(i).getKey();
        }
        return result;
    }
}