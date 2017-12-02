package sedgewick_algo.week2_stack_queue_basicsort.stack;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class FixedCapacityArrayOfStrings {
    private String[] s;
    private int N=0;

    public FixedCapacityArrayOfStrings(int capacity){
        s = new String[capacity];
    }

    public boolean isEmpty(){
        return N==0;
    }

    public void push(String item){
        s[N++] = item;
    }

    public String pop(){
        return s[--N];
    }

    public static void main(String[] args) {
        FixedCapacityArrayOfStrings stack = new FixedCapacityArrayOfStrings(5);
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();

            if(item.equals("-")){
                StdOut.print(stack.pop());
            }else {
                stack.push(item);
            }
        }
    }
}
