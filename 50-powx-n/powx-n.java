class Solution {
    double calpow(double x, long n){
        //Base
        if(n==0) return 1.0;
        if(n==1) return x;
        //recursion
        if(n%2==0){
            return calpow(x*x,n/2);
        }
        else{
            return x*calpow(x,n-1);
        }

    }
    public double myPow(double x, int n) {
        if(n>=0){
            return calpow(x,(long) n);
        }
        else{
           x = 1.0/x;
           long nn=n;
           nn*=-1;
           return calpow(x,(long) nn); 
        }

    }
}