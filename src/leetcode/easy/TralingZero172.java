package leetcode.easy;

public class TralingZero172 {
    public int trailingZeroes(int n) {
        return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
    }

    public static void main(String args[]) {
        int n = new TralingZero172().trailingZeroes(11);
        System.out.println(n);
    }
}
