package sedgewick_algo.course2.week2_mst;

/*
Edge class - for MST algorithms
 */

public class Edge implements Comparable<Edge>{

    private final int v, w;
    private final double weight;

    public Edge(int v, int w, double weight) {
        this.v = v;
        this.w = w;
        this.weight = weight;
    }

    public int either(){
        return v;
    }

    public int other(int vertex){
        return this.v == vertex ? w: v;
    }

    @Override
    public int compareTo(Edge otherEdge) {
        if(this.weight < otherEdge.weight){
            return -1;
        }else if(this.weight > otherEdge.weight){
            return 1;
        }else{
            return 0;
        }
    }
}
