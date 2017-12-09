package sedgewick_algo.course1.week1_union_find;

import java.util.Scanner;

public class UF {
    private int[] id;

    public UF(int n) {
        id = new int[n];
        for(int i=0; i<n; i++){
            id[i] = i;
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        UF uf = new UF(N);

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

    private void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];

        for(int i=0; i<id.length; i++){
            if(id[i]==pid){
                id[i] = qid;
            }
        }
    }

    private boolean connected(int p, int q) {
        return id[p]==id[q];
    }

    private void print_connections(){
        for(int i=0; i<id.length; i++){
            System.out.print(id[i] + ",");
        }
    }
}
