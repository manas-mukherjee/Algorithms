package leetcode.easy;

public class ReverseInteger7 {

    private static int base10;

    public static void main(String args[]){
        int i = reverseNum(12345);
        System.out.println(i); //54321 = 5*10000 + 4*1000 + 3*100 + 2*10 + 1*1

        reversDigits(78654);
    }

    private static int reverseNum(final int num) {
        int q = num;
        int sum = 0;

        base10 = 10;
        while(q> 0){
            int rem = q % base10;
            q = q/base10;
            sum = sum*base10 + rem;
            if( sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE){
                return 0;
            }
        }
        return sum;
    }

    public static void reversDigits(long number) {
        System.out.println(number % 10);
        if (number >= 10) {
            reversDigits(number / 10);
        }
    }
}
