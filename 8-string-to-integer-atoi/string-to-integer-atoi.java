class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if(s.isEmpty()) return 0;

        int num = 0;
        int sign = 1;
        int index = 0;
        if(s.charAt(index) == '-' || s.charAt(index) == '+'){
            sign = (s.charAt(index) == '-') ? -1 : 1;
            index++;
        }

        while(index < s.length() && Character.isDigit(s.charAt(index))){
            int digit = s.charAt(index) - '0';
            if(num > (Integer.MAX_VALUE - digit) /10){
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num = num*10+digit;
            index++;
        }

        return num*sign;
    }
}