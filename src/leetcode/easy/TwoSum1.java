package leetcode.easy;

import java.util.HashMap;

public class TwoSum1 {

    public static void main(String args[]){
        int[] arr = {0,2, 7, 11, 15};
        for (int i : twoSum(arr,18)){
            System.out.println(i);
        }
    }

    private static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            int comp = (target-arr[i]);

            if(map.containsKey(arr[i])){
                return new int[]{map.get(arr[i]),i};
            }else {
                map.put(comp,i);
            }
        }
        throw new IllegalArgumentException("No 2-sum available");
    }
}
