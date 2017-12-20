package leetcode.easy;

public class MissingNumber268 {
    public int missingNumber(int[] nums) {

        int n = nums.length, sum = 0;
        for (int i : nums) {
            sum += i;
        }

        int sumOfFirstN = (n * (n + 1)) / 2;
        return sumOfFirstN - sum;
    }

    public static void main(String args[]) {

        MissingNumber268 obj = new MissingNumber268();
        int ret = obj.missingNumber(new int[]{0});
        System.out.println(ret);
    }
}
