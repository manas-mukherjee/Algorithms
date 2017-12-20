package leetcode.easy;

public class PowerOfThree326 {


    /*
    My version
     */
    public boolean isPowerOfThree(int n) {
        int count = 0;

        boolean isPower = true;

        while (n!=1){
            if(n%3 != 0){
                isPower = false;
                break;
            }
            n /= 3;

            count ++;
        }
        return isPower;
    }

    public boolean isPowerOfThree1(int n) {
        // 1162261467 is 3^19,  3^20 is bigger than int
        return ( n>0 &&  1162261467%n==0);
    }

    public boolean isPowerOfThree2(int n) {
        return n>0 && (n==1 || (n%3==0 && isPowerOfThree(n/3)));
    }

    public static void main(String args[]) {
        PowerOfThree326 obj = new PowerOfThree326();
        boolean ret = obj.isPowerOfThree(243);
        System.out.println(ret);
    }
}
