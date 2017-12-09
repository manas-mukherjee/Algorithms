package sedgewick_algo.course1.week3_merge_quick_sort;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class QuickSort {
    private static int counter;

    private static int partition(Comparable[] a, int lo, int hi){
        int i = lo, j = hi+1;

        while (true){
            while(less(a[++i],a[lo])){
                if(i==hi){
                    break;
                }
            }

            while ((less(a[lo],a[--j]))){
                if(j==lo){
                    break;
                }
            }

            if(i>=j){
                break;
            }
            exch(a,i,j);
        }

        exch(a, lo, j);
        return j;
    }

    public static void main(String[] args) {
        Integer[] a = {12, 10, 15, 1, 13, 8, 3, 7, 4, 0, - 1, -2, 99, 33};

        show(a);
        QuickSort.sort(a);
        show(a);

        StdOut.print("\n Total operation - " + counter);

        int kth = 11;
        StdOut.print("\n " + kth + "the largest element - " + select(a, 7));


    }

    private static void sort(Integer[] a) {
        StdRandom.shuffle(a);
        StdOut.println("After shuffling \n");
        show(a);

        sort(a, 0, a.length-1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if(hi<=lo){
            return;
        }
        int j = partition(a, lo, hi);
        sort(a, lo, j-1);
        sort(a,j+1,hi);
    }

    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
    }

    private static boolean isSorted(Comparable[] a, int lo, int hi){
        for (int i = lo; i < hi-1; i++) {
            if(!less(a[i], a[i+1])){
                return false;
            }
        }
        return true;
    }

    private static boolean less(Comparable v, Comparable w) {
        counter++;
        return v.compareTo(w) < 0;
    }

    private static void exch(Object[] a, int i, int j) {
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static Comparable select(Comparable[] a, int k){
        int lo=0, hi=a.length-1;
        while(hi>lo){
            int j = partition(a, lo, hi);
            if(j<k){
                lo = j + 1;
            }else if(j>k){
                hi = j -1;
            }else {
                return a[k];
            }
        }
        return a[k];
    }
}
