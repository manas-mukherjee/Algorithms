package sedgewick_algo.course2.week1_graph;

/*
Tremaux maze exploration
1. Unroll a ball behind you
2. Mark each passage and intersection
3. Retrace steps when no unvisited options

DepthFirstSerach(to visit a vertex v)
    Mark v as visited.
    Recursively visit all unmarked vertices
        w adjacent to v
 */

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Stack;

public class DepthFirstSerach {
    private boolean[] marked;
    private int[] edgeTo;
    private int s;

    DepthFirstSerach(Graph G, int s){
        this.marked = new boolean[G.getV()];
        this.edgeTo = new int[G.getV()];
        this.s = s;
        dfs(G,s);
    }

    private void dfs(Graph G, int v) {
        marked[v] = true;
        for (int w: G.adj(v)){
            if(!marked[w]){
                edgeTo[w] = v;
                dfs(G,w);
            }
        }
    }

    public boolean hasPathTo(int v){
        return marked[v];
    }

    public Iterable<Integer> pathTo(int v){
        if(!hasPathTo(v)){
            return null;
        }
        Stack<Integer> path = new Stack<>();

        for (int x=v; x!=s; x=edgeTo[x]){
            path.push(x);
        }
        path.push(s);

        return path;
    }

    public static void main(String args[]){
        Graph graph = new Graph(new In(args[0]));
        DepthFirstSerach dfs = new DepthFirstSerach(graph, 0);

        System.out.println("Has path to node 3 ? -> " + dfs.hasPathTo(3));
        System.out.println("Path to node 3. -> " + dfs.pathTo(3));
    }
}
