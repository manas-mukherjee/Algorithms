package leetcode.easy;

import java.util.Arrays;

public class MoveZeroes283 {

/* My bad solution

    public void moveZeroes(int[] nums) {
        int zeroCount = 0;
        boolean nextSubIsZero = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0 && !nextSubIsZero) {
                zeroCount++;
            }

            if ((i + zeroCount) < nums.length) {
                if (nums[i + zeroCount] == 0) {
                    zeroCount++;
                    nextSubIsZero = true;
                } else {
                    nextSubIsZero = false;
                }
                nums[i] = nums[i + zeroCount];
            } else if ((i + zeroCount) >= nums.length) {
                nums[i] = 0;
            }

        }

        //System.out.println(Arrays.toString(nums));
    }
*/
    public void moveZeroes1(int[] nums) {

        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    // Shift non-zero values as far forward as possible
// Fill remaining space with zeros

    public void moveZeroes2(int[] nums) {
        if (nums == null || nums.length == 0) return;

        int insertPos = 0;
        for (int num: nums) {
            if (num != 0) nums[insertPos++] = num;
        }

        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }

    public static void main(String args[]) {
        MoveZeroes283 obj = new MoveZeroes283();
        obj.moveZeroes2(new int[]{0, 1, 0, 3, 12,0,5,0,0,9});
    }
}
