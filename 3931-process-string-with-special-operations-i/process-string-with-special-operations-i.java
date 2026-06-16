class Solution {
    public String processStr(String s) {
        String temp = "";
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch == '*'){
                if(sb.length()>0){
                    sb.deleteCharAt(sb.length()-1);
                }
            }else if(ch == '#'){
                temp = sb.toString();
                sb.append(temp);

            }else if(ch == '%'){
                sb.reverse();
            }else{
                sb.append(ch);

            }
        }
        return sb.toString();

    }
}