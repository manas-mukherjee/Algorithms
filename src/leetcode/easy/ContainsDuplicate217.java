package leetcode.easy;

import java.util.HashSet;

public class ContainsDuplicate217 {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i: nums){
            if(set.contains(i)){
                return true;
            }else {
                set.add(i);
            }
        }
        return false;
    }


    public static void main(String args[]){
        ContainsDuplicate217 obj = new ContainsDuplicate217();
        boolean ret = obj.containsDuplicate(new int[]{1,2,3,4,5});
        System.out.println(ret);
    }
}
