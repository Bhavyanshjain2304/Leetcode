class Solution {
public:
    bool isValid(string word) {
        if(word.length()<3) return false;
        int v = 0,c = 0;
        for(auto i : word){
            if(isalpha(i)){
                if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u'){
                    v++;
                }else if(i=='A'||i=='E'||i=='I'||i=='O'||i=='U'){
                    v++;
                }else{
                    c++;
                }
            }
            if(! (isalpha(i) || isdigit(i))){
                return false;
            }
        }
        return (v>=1 && c>=1);

    }
};