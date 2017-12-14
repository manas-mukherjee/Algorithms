package leetcode.easy;

import java.util.ArrayList;

public class MasSubarrayLargestSum53 {

    public int maxSubArray(int[] A) {
        int max = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (sum < 0)
                sum = A[i];
            else
                sum += A[i];
            if (sum > max)
                max = sum;
        }
        return max;
    }

    public static void main(String args[]){
        int[] input = {-2,1,-3,4,-1,2,1,-5,4};
        MasSubarrayLargestSum53 obj = new MasSubarrayLargestSum53();
        int sum = obj.maxSubArray(input);
        System.out.println(sum);
    }
}
