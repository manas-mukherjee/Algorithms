package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSome {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int counter = 0;
        for (int i : nums) {
            if (map.containsKey(i)){
                return new int[]{map.get(i),counter};
            }
            int comp = target-i;
            map.put(comp,counter);
            counter ++;
        }
        throw new IllegalArgumentException("No  two-sum solution");
    }

    public static void main(String args[]){
        TwoSome client = new TwoSome();
        int[] arr = {1,2,3,4,5};
        int[] ret = client.twoSum(arr, 7);
        System.out.println(ret[0] + ","+ ret[1]);
    }
}
