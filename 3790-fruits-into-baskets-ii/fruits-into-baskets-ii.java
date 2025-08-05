class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        boolean[] flag = new boolean[n];
        Arrays.fill(flag,false);
        int taken = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(fruits[i]<=baskets[j] && flag[j]==false){
                    taken++;
                    flag[j] = true;
                    break;
                }
            }
        }
        return n-taken;
    }
}