package leetcode.easy;

import java.util.Arrays;

public class HouseRobber198 {

    public int rob(int[] nums) {
        int total = 0;

        int[] maxValPos = new int[nums.length / 2 + 1];
        int maxPos = 0, lastIndex = -2, cnt = 0;

        for (int i = 0; i < nums.length; i += 2) {
            if (i != nums.length - 1) {
                maxPos = maxval(nums, i, i + 1);
                maxValPos[cnt] = maxPos;
            } else {
                maxPos = i;
                maxValPos[cnt] = maxPos;

            }

            if (maxPos - lastIndex > 1) {
                total += nums[maxPos];
            }

            cnt++;
            lastIndex = maxPos;
        }

        return total;
    }

    private int maxval(int[] nums, int i, int j) {
        return nums[i] >= nums[j] ? i : j;
    }

    public static void main(String args[]) {
        HouseRobber198 obj = new HouseRobber198();
        int amt = obj.rob(new int[]{2, 3, 2});
        // 122, 1, 3, 234, 44, 5, 66
        System.out.println(amt);
    }
}
