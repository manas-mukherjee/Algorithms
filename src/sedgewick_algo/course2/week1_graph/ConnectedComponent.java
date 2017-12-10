package sedgewick_algo.course2.week1_graph;

/*
Connected Component
*/

import edu.princeton.cs.algs4.In;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ConnectedComponent {
    private boolean[] marked;
    private int[] componentIds;
    private int componetCount;
    private int s;

    ConnectedComponent(Graph G, int s){
        this.marked = new boolean[G.getV()];
        this.componentIds = new int[G.getV()];
        this.s = s;

        for(int v=0; v<G.getV(); v++){
            if(!marked[v]){
                dfs(G,v);
                componetCount++;
            }
        }
    }

    private void dfs(Graph G, int v) {
        marked[v] = true;   // All vertices discovered in the same dfs have the same componentId
        componentIds[v] = componetCount;
        for (int w: G.adj(v)){
            if(!marked[w]){
                dfs(G,w);
            }
        }
    }

    public int getNumberOfGraphComponent(){
        return this.componetCount;
    }

    public int getComponentNumberOfNode(int v){
        return componentIds[v];
    }

    public HashMap<Integer, ArrayList> getComponetToVerticesMap(){
        HashMap<Integer, ArrayList> map = new HashMap<Integer, ArrayList>();

        ArrayList<Integer> nodeList = new ArrayList<>();
        for(int v=0; v<this.componentIds.length ; v++){
            Integer componentId = componentIds[v];

            if(map.containsKey(componentId)){
                map.get(componentId).add(v);
            }else {
                ArrayList<Integer> vertices = new ArrayList<>();
                vertices.add(v);
                map.put(componentId, vertices);
            }
        }
        return map;
    }

/* These methods are nice to have but not required. These are used in the DFS code.
    public boolean hasPathTo(int v){
        return marked[v];
    }

    public Iterable<Integer> pathTo(int v){
        if(!hasPathTo(v)){
            return null;
        }
        Stack<Integer> path = new Stack<>();

        for (int x=v; x!=s; x= componentIds[x]){
            path.push(x);
        }
        path.push(s);

        return path;
    }
*/

    public static void main(String args[]){
        Graph graph = new Graph(new In(args[0]));
        ConnectedComponent cc = new ConnectedComponent(graph, 0);

        System.out.println("Number of component - " + cc.getNumberOfGraphComponent());
        System.out.println("Get component number of Node ' " + 5 + "' is " + cc.getComponentNumberOfNode(5));
        for(Map.Entry<Integer, ArrayList> mapEntry : cc.getComponetToVerticesMap().entrySet()){
            System.out.println(mapEntry.getKey() + " - " + mapEntry.getValue());
        }
    }
}
