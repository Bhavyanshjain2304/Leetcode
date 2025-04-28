class Solution {
    public List<List<Integer>> generate(int numRows) {
        int n = numRows;
        List<List<Integer>> mat = new ArrayList<>();
        
        for(int row = 0;row<n;row++){
            List<Integer> list = new ArrayList<>();
            for(int i = 0;i<=row;i++){
                if(row == i || i == 0){
                    list.add(1);
                }else{
                    list.add(mat.get(row-1).get(i-1) + mat.get(row-1).get(i));
                }
            }
            mat.add(list);
        }
        return mat;
    }
}