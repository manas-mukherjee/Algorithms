package leetcode.easy;

public class PlusOne66 {

/*    public int[] plusOne(int[] digits) {
        int add = 1 , sum=0;
        int lastDigitIndex = digits.length - 1;

        int d = digits[lastDigitIndex];
        sum = d + 1;

        if(sum > 9){
            digits[lastDigitIndex] = 0;

            for(int i = lastDigitIndex-1; i>=0; i--){
                sum = digits[i] + 1;
                if(sum > 9){
                    digits[i] = 0;
                }else {
                    digits[i] = sum;
                    break;
                }
            }
        }else{
            digits[lastDigitIndex] = sum;
        }
        return digits;
    }*/

    public int[] plusOne(int[] digits) {

        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newNumber = new int [n+1];
        newNumber[0] = 1;

        return newNumber;
    }

    public static void main(String args[]){
        PlusOne66 obj = new PlusOne66();
        int[] ret = obj.plusOne(new int[]{9});
        for(int i: ret){
            System.out.println(i);
        }
    }
}
