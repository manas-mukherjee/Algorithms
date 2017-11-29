package CTCI.treesgraph;

public class POCNumberCountRec {
    public static void main(String args[]){
        POCNumberCountRec obj = new POCNumberCountRec();
        obj.test(10);
    }

    private void test(int n) {
        if(n!=0){
            test(--n);
            System.out.println("n -> " + n);
        }
    }
}
