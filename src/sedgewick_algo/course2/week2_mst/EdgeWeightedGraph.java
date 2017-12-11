package sedgewick_algo.course2.week2_mst;

import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.In;

public class EdgeWeightedGraph {
    private final int V;
    private int E=0;
    private Bag<Edge>[] adj;

    public EdgeWeightedGraph(int V) {
        this.V = V;
        this.adj = (Bag<Edge>[]) new Bag[V];
        for(int i=0; i<V; i++){
            this.adj[i] = new Bag<Edge>();
        }
    }

    public EdgeWeightedGraph(In in) {
        //TODO: need to implement it properly
        this(10);

    }

    public void addEdge(Edge e){
        int v = e.either();
        int w = e.other(v);

        this.adj[v].add(e);
        this.adj[w].add(e);
    }

    public Iterable<Edge> adj(int V){
        return this.adj[V];
    }

    public Bag<Edge>[] getAdj() {
        return adj;
    }

    public int getV() {
        return V;
    }

    public static void main(String args[]){
        //TODO: Need to change the input
        EdgeWeightedGraph graph = new EdgeWeightedGraph(5);

        for (int v=0; v<graph.getV(); v++){
            System.out.println(v);
            System.out.println();
            for(Edge w : graph.adj(v)){
                System.out.print( w + " ");
            }
            System.out.println("\n-------");
        }
    }
}
