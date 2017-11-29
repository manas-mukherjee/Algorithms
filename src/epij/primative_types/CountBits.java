package epij.primative_types;

public class CountBits {

    public static void main(String args[]){
        countBits(7);
        System.out.println(getBit(25,3));
        System.out.println(setBit(25,2));
        System.out.println(clearBit(25, 3));
    }

    // Count Number of 1 in a given number
    private static short countBits(int x) {
        short numBits = 0;
        while( x!=0){
            numBits += (x&1);
            x >>>= 1;
        }
        return numBits;
    }

    //GetBit
    private static boolean getBit(int num, int i){
        int ifBitSet = num & (1 << i);
        System.out.println(ifBitSet);
        return ifBitSet !=0;
    }

    //SetBit
    private static int setBit(int num, int i){
        num = num | (1<<i);
        return num;
    }

    //Clear Bit
    private static int clearBit(int num, int i){
        num = num & ~((1 << i));
        return num;
    }
}
