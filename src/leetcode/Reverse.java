package leetcode;

public class Reverse {
    int mod;
    private int reversedNum;

    public int reverse(int x) {
        System.out.println(Integer.MAX_VALUE);
        StringBuffer sb = new StringBuffer();
        Boolean negFlag = false;
        if(x<0){
            negFlag = true;
            x = Math.abs(x);
        }
        while(true){
            mod = x%10;
            x = x/10;
            sb.append(mod);
            if (x<10){
                sb.append(x);
                reversedNum = Integer.parseInt(sb.toString());
                return negFlag ? -1*reversedNum :reversedNum;
            }
        }
    }

    public static void main(String args[]){
        int i = new Reverse().reverse(1234567890);
        System.out.println(i);
    }
}
