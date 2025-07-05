class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = -1;
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getKey()==entry.getValue()){
                ans = entry.getKey();
            }
        }
        return ans;
    }
}