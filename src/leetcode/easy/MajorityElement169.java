package leetcode.easy;

public class MajorityElement169 {

    // Using Moore’s Voting Algorithm
    public int majorityElement(int[] nums) {
        int count = 0, ret = 0;

        for (int i : nums) {
            if (count == 0) {
                ret = i;
            }
            if (i != ret) {
                count--;
            } else {
                count++;
            }
        }
        return ret;
    }

    public static void main(String args[]) {
        int[] input = {2, 1, 1, 1, 1, 1, 2, 3, 4};
        MajorityElement169 obj = new MajorityElement169();
        int me = obj.majorityElement(input);
        System.out.println("Majority element - " + me);
    }
}
