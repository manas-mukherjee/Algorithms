package leetcode;

public class Palindrome {
    public boolean isPalindrome(int x) {
        String input = Integer.toString(x);
        int i = 0;
        int len = input.length();
        int j = len -1;

        for(;i<j;i++,j--){
            if(input.charAt(i) != input.charAt(j)){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        Palindrome p = new Palindrome();
        System.out.println(p.isPalindrome(212));
    }
}
