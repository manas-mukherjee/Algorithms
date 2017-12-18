package leetcode.easy;


//TODO: Read - Floyd Cycle detection algorithm
//REf- https://en.wikipedia.org/wiki/Cycle_detection
//Hash Table, Math

import java.util.HashSet;
import java.util.Set;

public class HappyNumber202 {
    int digitSquareSum(int n) {
        int sum = 0, tmp;
        while (n != 0) {
            tmp = n % 10;
            sum += tmp * tmp;
            n /= 10;
        }
        return sum;
    }

    boolean isHappy(int n) {
        int slow, fast;
        slow = fast = n;
        do {
            slow = digitSquareSum(slow);
            fast = digitSquareSum(fast);
            fast = digitSquareSum(fast);
        } while (slow != fast);
        if (slow == 1) return true;
        else return false;
    }

    /* Alternative approach
    The idea is to use one hash set to record sum of every digit square of every number occurred.
    Once the current sum cannot be added to set, return false; once the current sum equals 1, return true;
    public boolean isHappyHashset(int n) {
        Set<Integer> inLoop = new HashSet<Integer>();
        int squareSum,remain;
        while (inLoop.add(n)) {
            squareSum = 0;
            while (n > 0) {
                remain = n%10;
                squareSum += remain*remain;
                n /= 10;
            }
            if (squareSum == 1)
                return true;
            else
                n = squareSum;

        }
        return false;
    }
    */

    public static void main(String args[]) {
        HappyNumber202 obj = new HappyNumber202();
        boolean isHappy = obj.isHappy(24);
        System.out.println(isHappy);
    }
}
