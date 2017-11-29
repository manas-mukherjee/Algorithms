package leetcode;

public class StairCountWays {
    public int climbStairs(int n) {
        int count = 0;
        int i=0, j=0;

        for (i = 0, j=0; i <= n & j<=n; i++, j+=2) {
            if(i==n || j==n){
                count++;
            }
            if (i + j == n) {
                System.out.println("case1 - " + i + " " +j);
                count++;
            }
        }
        return n == 1 ? 1 : count;
    }

    public static void main(String args[]){
        int i = new StairCountWays().climbStairs(2);
        System.out.println(i);
    }
}
