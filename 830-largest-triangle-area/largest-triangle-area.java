class Solution {
    public double largestTriangleArea(int[][] points) {
        int n = points.length;
        double maxArea = 0.0;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                for(int k = j+1;k<n;k++){
                    double area = calArea(points[i],points[j],points[k]);
                    maxArea = Math.max(area,maxArea);
                }
            }
        }
        return maxArea;
    }

    public static double calArea(int[] i, int[] j,int[] k){
        return 0.5 * Math.abs(i[0] * (j[1]-k[1]) + j[0] * (k[1]-i[1]) + k[0] * (i[1]-j[1]));
    }
}