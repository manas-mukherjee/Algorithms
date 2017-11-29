package CTCI;

public class RecursionPowerOf2 {
    public static void main(String args[]){
        RecursionPowerOf2 obj = new RecursionPowerOf2();
        System.out.println( obj.powerOf2(9));
    }

    private int powerOf2(int n) {
        if(n<1){
            return 0;
        }else if(n==1){
            System.out.println();
        }
        return 1;
    }

}
