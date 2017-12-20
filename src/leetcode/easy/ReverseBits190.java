package leetcode.easy;

public class ReverseBits190 {
    int result;

    //TODO: Need to complete this.
    // you need treat n as an unsigned value
    public void reverseBits(int n) {
        for(int i=0; i<32; i++){
            result += n & 1;
            n = n>>>1;
        }
        System.out.println(result);
    }


    public static void main(String args[]){
        ReverseBits190 obj = new ReverseBits190();
        obj.reverseBits(15);
    }
}
