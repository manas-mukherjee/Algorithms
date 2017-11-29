package leetcode.top_interview;

import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {

    public int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();

        int compPos = 0, currPos=0;
        int comp = 0;

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                compPos = map.get(nums[i]);
                currPos = i;
                return new int[]{currPos, compPos};
            }

            comp = target - nums[i];
            map.put(comp,i);
        }
        throw new IllegalArgumentException("No two-sum solution");
    }

    public static void main(String args[]){
        TwoSum1 obj = new TwoSum1();
        int[] arr = {0,2, 7, 11, 15};
        for (int i : obj.twoSum(arr,18)){
            System.out.println(i);
        }
    }
}
