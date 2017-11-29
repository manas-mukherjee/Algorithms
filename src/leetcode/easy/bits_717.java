package leetcode.easy;

public class bits_717 {
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length, i = 0;
        while (i < n - 1) {
            if (bits[i] == 0) i++;
            else i += 2;
        }
        System.out.println(i);
        return i == n - 1;
    }

    public static void main(String args[]){
        bits_717 obj = new bits_717();

        int[] bits = {1,0,1,1};
        System.out.println(obj.isOneBitCharacter(bits));
    }
}
