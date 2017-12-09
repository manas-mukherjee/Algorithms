package sedgewick_algo.course1.week2_stack_queue_basicsort.basic_sort;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class KnuthShuffle {
    public static void shuffle(Object arr[]){
        for(int i=0; i<arr.length; i++){
            int r = StdRandom.uniform(i+1);
            exch(arr, i,r );
        }
    }

    public static void main(String args[]){
        Object[] a = {1,4,7,10,12,3,8,11,15};
        show(a);
        KnuthShuffle.shuffle(a);
        show(a);
    }

    private static void show(Object[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + " ");
        }
        System.out.println();
    }

    private static void exch(Object[] a, int i, int j) {
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
