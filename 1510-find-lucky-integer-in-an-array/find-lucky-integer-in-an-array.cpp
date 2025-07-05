class Solution {
public:
    int findLucky(vector<int>& arr) {
        unordered_map<int,int>mpp;
        int n = arr.size();
        for(int i = 0;i<n;i++){
            mpp[arr[i]]++;
        }
        int maxi = -1;
        for(int num : arr){
            if(mpp[num] == num){
                maxi = max(maxi, num);
            }
        }
        return maxi;
    }
};