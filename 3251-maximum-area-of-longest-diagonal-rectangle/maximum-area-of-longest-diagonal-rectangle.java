class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDiagSq = Integer.MIN_VALUE;
        int maxArea = 0;

        for (int[] dim : dimensions) {
            int a = dim[0];
            int b = dim[1];
            int diagSq = a * a + b * b; 
            int area = a*b;

            if (diagSq > maxDiagSq || (diagSq == maxDiagSq && area > maxArea)) {
                maxDiagSq = diagSq;
                maxArea = area;
            }
        }
        return maxArea;
    }
}
