package leetcode;

import java.util.Scanner;

public class RemoveDuplicatesFromSortedList {
    public int removeDuplicates(int[] nums) {
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

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        int counter = 0;

        while (counter < n) {
            arr[counter] = scanner.nextInt();
            counter++;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println(new RemoveDuplicatesFromSortedList().removeDuplicates(arr));
    }
}
