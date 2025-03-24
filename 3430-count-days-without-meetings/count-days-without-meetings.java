class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a,b) -> a[0] - b[0]);
        int freeDays = 0;
        int lastEnd = 0;

        for(int[] meeting : meetings){
            int start = meeting[0];
            int end = meeting[1];

            if(start > lastEnd){
                freeDays += start - lastEnd -1;

            }
            lastEnd = Math.max(lastEnd,end);
        }
        freeDays  += days-lastEnd;

        return freeDays;
    }
    
}