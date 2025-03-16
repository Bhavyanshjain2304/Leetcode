class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int l = 0;
        int r = s.length()-1;
        while(l<r){
            char ch1 = s.charAt(l);
            char ch2 = s.charAt(r);

            if(!(ch1>='a'&&ch1<='z' || ch1>='0'&&ch1<='9')){
                l++;
                continue;
            }
            if(!(ch2>='a'&&ch2<='z' || ch2>='0'&&ch2<='9')){
                r--;
                continue;
            }
            if(ch1!=ch2){
                return false;

            }
            l++;
            r--;
        }
        return true;
    }
}