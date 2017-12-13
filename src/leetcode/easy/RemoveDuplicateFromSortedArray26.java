package leetcode.easy;

public class RemoveDuplicateFromSortedArray26 {
    public static int removeDuplicates(int[] nums) {
        if(nums.length<1){
            return 0;
        }
        int currentInt = nums[0];
        int withoutDupArrayCounter = 1;

        for (int i=1 ; i<nums.length; i++) {
            if(currentInt == nums[i]){
                continue;
            }else{
                nums[withoutDupArrayCounter]=nums[i];
                withoutDupArrayCounter++;
                currentInt = nums[i];
            }
        }
        return withoutDupArrayCounter;
    }

    public static void main(String args[]){
        int ret = RemoveDuplicateFromSortedArray26.removeDuplicates(new int[]{1,1,2,2,2,2,3,4,5,5});
        System.out.println(ret);
    }
}
