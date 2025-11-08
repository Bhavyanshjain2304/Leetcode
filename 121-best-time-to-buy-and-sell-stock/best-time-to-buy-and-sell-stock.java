class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = prices[0]-min;

        for(int i = 0;i<prices.length;i++){
            if(prices[i]>min){
                int temp = prices[i]-min;
                max = Math.max(temp,max);
            }else{
                min = prices[i];
            }
        }
        return max;
    }
}