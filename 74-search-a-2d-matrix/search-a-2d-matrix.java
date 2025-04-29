class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean flag = false;
        for(int i = 0;i<n;i++){
            if(target >= matrix[i][0] && target <= matrix[i][m-1]){
                flag =  bs(matrix[i],target);
                return flag;
            }
        }
        return flag;
    }
    public boolean bs(int[] nums,int target){
        int l = 0;
        int r = nums.length-1;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(nums[mid] == target){
                return true;
            }else if(nums[mid]>target){
                r = mid-1;
            }else if(nums[mid]<target){
                l = mid+1;
            }
        }
        return false;
    }

}