package leetcode.easy;

// Input - {1, 2, 3, 4, 5, 6, 7, 8}, k=3
// Output - 5,4,3,2,1, 8,7,6 => 8,7,6,1,2,3,4,5


public class RotateArray189 {

    public void rotate(int[] nums, int k) {

        if(nums == null || nums.length < 2){
            return;
        }

        int len = nums.length;

        // very imp
        k = k % nums.length;

        reverseArray(nums, 0, len - 1 - k);
        reverseArray(nums, len - k, len - 1);
        reverseArray(nums, 0, len - 1);
    }

    private void reverseArray(int[] nums, int i, int l) {
        if(i>=l){
            return;
        }

        int t = nums[i];
        nums[i] = nums[l];
        nums[l] = t;

        reverseArray(nums, i+1, l-1);
    }

    public static void main(String args[]) {
        RotateArray189 obj = new RotateArray189();

        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};

        obj.printArray(nums);
        obj.rotate(nums, 3);
        obj.printArray(nums);
    }

    private void printArray(int[] nums) {
        for (int x : nums) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
