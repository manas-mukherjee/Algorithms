package leetcode.easy;

public class NumberOf1Bits191 {
    public int hammingWeight(int n) {
        int res = 0;

        while (n!=0){
            res += n & 1;
            n>>>=1;
        }

        return res;
    }

    public static void main(String args[]){
        NumberOf1Bits191 obj = new NumberOf1Bits191();
        int output = obj.hammingWeight(15);
        System.out.println(output);
    }
}
