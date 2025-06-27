class Solution {
    public boolean isPalindrome(int x) {
        
        if(x<0){
            return false;
        }else if(x==0){
            return true;
        }
        int org = x;
        long ans = 0;
        while(x>0){
            int rem = x%10;
            ans = ans*10 + rem;
            x = x/10;
        }
        
        return ans==org;

        
    }
}