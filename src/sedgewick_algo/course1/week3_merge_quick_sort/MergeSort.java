package sedgewick_algo.course1.week3_merge_quick_sort;

/*
Divide array into two halves.
Recursively sort each half.
Merge two halves.
 */

import edu.princeton.cs.algs4.StdOut;

public class MergeSort {
    private static int counter;

    public static void sort(Comparable[] a, Comparable[] aux, int lo, int hi){
        System.out.println("sort("+ lo + ","+hi+")");
        if(lo>=hi){
            return;
        }
        int mid = lo + (hi-lo)/2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid+1, hi);
        merge(a, aux, lo, mid, hi);
    }

    public static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi){
        System.out.println("merge("+ lo + "," +mid+ ","+hi+")");
        assert isSorted(a, lo, mid);
        assert isSorted(a, mid+1, hi);

        for (int k=0; k<=hi; k++){
            aux[k] = a[k];
        }
        int i = lo;
        int j = mid + 1;

        for (int k=lo; k<=hi; k++){
            if(i>mid){
                a[k] = aux[j++];
            }else if(j>hi){
                a[k] = aux[i++];
            }else if(less(aux[i], aux[j])){
                a[k] = aux[i++];
            }else{
                a[k] = aux[j++];
            }
        }
        assert isSorted(a, lo, hi);
        show(a);
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

    public static void main(String[] args) {
        Integer[] a = {12, 10, 15, 1, 7, 8, 3, 11, 4, 0, - 1, -2, 99};
        Integer[] aux = new Integer[a.length];

        show(a);
        MergeSort.sort(a, aux,0,a.length-1);
        show(a);

        StdOut.print("\n Total operation - " + counter);
    }
}
