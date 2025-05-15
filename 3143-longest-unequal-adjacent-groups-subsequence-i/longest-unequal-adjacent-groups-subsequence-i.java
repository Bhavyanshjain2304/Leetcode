class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        int n = groups.length;
        List<String> ans = new ArrayList<>();
        int groupId = -1;
        for(int i = 0;i<n;++i){
            if(groups[i] != groupId){
                groupId = groups[i];
                ans.add(words[i]);
            }
        }
        return ans;
        
    }
}