package sedgewick_algo.course1.week2_stack_queue_basicsort.stack;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class ResizeCapacityArrayOfStrings {
    private String[] s;
    private int N=0;

    public ResizeCapacityArrayOfStrings(){
        s = new String[1];
    }

    public boolean isEmpty(){
        return N==0;
    }

    public void push(String item){
        if(N==s.length){
            resize(2*s.length);
        }
        s[N++] = item;
    }

    /* Create new array with double capacity
    * Cost of inserting first N items - N + (2+4+...) = ~3N*/
    private void resize(int capacity) {
        String[] newStringArry = new String[capacity];
        for(int i=0; i<N; i++){
            newStringArry[i] = s[i];
        }
        s = newStringArry;
    }

    /* Shrinking - Make the size 1/2 when the current array is 1/4th filled*/
    public String pop(){
        String item = s[--N];
        s[N] = null;

        if(N>0 && N==s.length/4){
            resize(s.length/2);
        }
        return item;
    }

    public static void main(String[] args) {
        ResizeCapacityArrayOfStrings stack = new ResizeCapacityArrayOfStrings();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();

            if(item.equals("-")){
                StdOut.print(stack.pop() + " ");
            }else {
                stack.push(item);
            }
        }
    }
}
