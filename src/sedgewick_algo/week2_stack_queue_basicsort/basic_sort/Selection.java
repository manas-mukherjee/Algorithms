package sedgewick_algo.week2_stack_queue_basicsort.basic_sort;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Selection {
    static int counter;

    public static void sort(Comparable[] a){
        int n = a.length;
        int min = 0;

        for(int i=0; i<n; i++){
            min = i;
            for ( int j=i+1; j<n; j++){
                if(less(a[j], a[min])){
                    min = j;
                }
            }
            exch(a, i, min);
        }
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

    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.println(a[i]);
        }
    }

    public static void main(String[] args) {
        int capacity = StdIn.readInt();
        StdOut.print("Input size - " + capacity + "\n");
        String input[] = new String[capacity];
        int i = 0;
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (item.equals("-")) {
                break;
            }
            input[i++] = item;
        }

        Selection.sort(input);
        show(input);
        StdOut.print("\n Total operation - " + counter);
    }
}
