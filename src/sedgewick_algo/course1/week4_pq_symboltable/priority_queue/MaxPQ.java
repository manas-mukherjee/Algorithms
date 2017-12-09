package sedgewick_algo.course1.week4_pq_symboltable.priority_queue;

public class MaxPQ<Key extends Comparable<Key>>{

    private static int counter;

    private int n;           // number of elements on PQ
    private int[] pq;        // binary heap using 1-based indexing

    /* Child's key become larger than that of parent*/
    private void swim(int k){
        while (k>1 && less(k/2, k)){
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        counter++;
        return v.compareTo(w) < 0;
    }

    private void exch(int i, int j) {
        int temp = pq[i];
        pq[i] = pq[j];
        pq[j] = temp;
    }
}
