class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        generateSubsets(0, nums, new ArrayList<>(), subsets);
        return subsets;
    }
    public void generateSubsets(int index, int[]nums, List<Integer> current, List<List<Integer>> result){
        if(index == nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        // include current element
        current.add(nums[index]);
        generateSubsets(index+1,nums,current,result);

        // exclude current element
        current.remove(current.size() - 1);
        generateSubsets(index+1,nums,current,result);

    }
}