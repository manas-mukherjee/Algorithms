package CTCI.treesgraph;

public class POCRandomCardShuffle {
    public static void main(String args[]){
        for (int i=0; i<52; i++){
            int r = (int) (i + Math.random() * (52-i));
            System.out.println(r);
        }
    }
}
