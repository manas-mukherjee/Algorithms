package leetcode.easy;

public class SingleNumber136 {

    public int singleNumber(int[] nums) {
        int res = 0;

        for(int i=0; i<nums.length; i++){
            res ^= nums[i];
        }
        return res;
    }

    public static void main(String args[]){
        SingleNumber136 obj = new SingleNumber136();
        int ret = obj.singleNumber(new int[]{1,1,3,4,4,5,5});
        System.out.println(ret);
    }
}
