package sedgewick_algo.course2.week1_graph.undirected;

import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.In;

/*
Adjacency list representation using Bags.
Real word graphs are 'sparse' ( large number of vertices, small avg vertext degree )
Space(and time taken) is propotional to the number of edges

space : E+V

 */

public class Graph {
    private final int V;
    private int E=0;
    private Bag<Integer>[] adj;

    public Graph(int V) {
        this.V = V;
        this.adj = (Bag<Integer>[]) new Bag[V];
        for(int i=0; i<V; i++){
            this.adj[i] = new Bag<Integer>();
        }
    }

    public Graph(In in){
        this(in.readInt());
        E = in.readInt();

        for (int i=0; i<E; i++){
            int v = in.readInt();
            int w = in.readInt();
            addEdge(v, w);
        }
    }

    public void addEdge(int v, int w){
        this.adj[v].add(w);
        this.adj[w].add(v);
    }

    public Bag<Integer>[] getAdj() {
        return adj;
    }

    public int getV() {
        return V;
    }

    public Iterable<Integer> adj(int V){
        return this.adj[V];
    }

    public static void main(String args[]){
        Graph graph = new Graph(new In(args[0]));

        for (int v=0; v<graph.getV(); v++){
            System.out.println(v);
            System.out.println();
            for(Integer w : graph.adj(v)){
                System.out.print( w + " ");
            }
            System.out.println("\n-------");
        }
    }
}
