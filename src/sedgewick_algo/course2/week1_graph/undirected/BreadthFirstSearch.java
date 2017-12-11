package sedgewick_algo.course2.week1_graph.undirected;

/*
Repeat until the queue is empty:
    remove vertex v from the queue:
    Add to queue all unmarked vertices adjacent to V and mark them

Ex -
ARPANAET, Kevin Bacon Number,Erdos graph
*/

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.Stack;

public class BreadthFirstSearch {
    private boolean[] marked;
    private int[] edgeTo;
    private int s;

    BreadthFirstSearch(Graph G, int s){
        this.marked = new boolean[G.getV()];
        this.edgeTo = new int[G.getV()];
        this.s = s;
        bfs(G,s);
    }

    private void bfs(Graph G, int s) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(s);
        marked[s] = true;

        while(!queue.isEmpty()){
            Integer v = queue.dequeue();

            for(Integer adjNode : G.adj(v)){
                if(!marked[adjNode]){
                    queue.enqueue(adjNode);
                    marked[adjNode]=true;
                    edgeTo[adjNode]=v;
                }
            }
        }
    }

    public static void main(String args[]){
        Graph graph = new Graph(new In(args[0]));
        BreadthFirstSearch dfs = new BreadthFirstSearch(graph, 0);

        System.out.println("Has path to node 3 ? -> " + dfs.hasPathTo(4));
        System.out.println("Path to node 3. -> " + dfs.pathTo(4));
    }

    public Iterable<Integer> pathTo(int v){
        if(!hasPathTo(v)){
            return null;
        }
        Stack<Integer> path = new Stack<>();

        for (int x=v; x!=s; x=edgeTo[x]){
            System.out.println("*-" + x);
            path.push(x);
        }
        path.push(s);

        return path;
    }

    private boolean hasPathTo(int v) {
        return marked[v];
    }
}
