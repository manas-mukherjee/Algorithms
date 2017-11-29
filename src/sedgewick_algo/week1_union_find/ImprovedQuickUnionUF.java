package sedgewick_algo.week1_union_find;

import java.util.Scanner;

public class ImprovedQuickUnionUF {
    private int[] id;

    public ImprovedQuickUnionUF(int n) {
        id = new int[n];
        for(int i=0; i<n; i++){
            id[i] = i;
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ImprovedQuickUnionUF uf = new ImprovedQuickUnionUF(N);

        int counter = 0;
        while (counter < N) {
            int p = scanner.nextInt();
            int q = scanner.nextInt();

            if (!uf.connected(p, q)) {
                uf.union(p, q);
                System.out.println(p + " " + q);
            }
            counter++;
        }
        uf.print_connections();
    }

    private int root(int i){
        while (i != id[i]){
            i = id[i];
        }
        return i;
    }

    private boolean connected(int p, int q) {
        return root(p)==root(q);
    }

    private void union(int p, int q) {
        int rootp = root(p);
        int rootq = root(q);
        id[rootp] = rootq;
    }

    private void print_connections(){
        for(int i=0; i<id.length; i++){
            System.out.print(id[i] + ",");
        }
    }
}
