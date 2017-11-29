package leetcode.medium;

class Solution {
    public double myPow(double x, int n) {
        double total =x;
        for(int i=1; i<n; i++){
            total = total*x;
        }
        return total;
    }

    public double pow(double x, int n) {
        if(n == 0)
            return 1;
        if(n<0){
            n = -n;
            x = 1/x;
        }
        return (n%2 == 0) ? pow(x*x, n/2) : x*pow(x*x, n/2);
    }

    public static void main(String args[]){
        System.out.println(new Solution().myPow(8,3));
    }
}