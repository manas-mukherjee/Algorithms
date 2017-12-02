package sedgewick_algo.week2_stack_queue_basicsort.stack;
import edu.princeton.cs.algs4.*;

public class LinkedStackOfStrings{

    private Node first = null;

    /*
        Size : 40 byes
        Class : 16 bytes
        Inner-Class : 8 bytes
        item : ref to String - 8 bytes
        Node : ref to Node - 8 bytes
     */
    private class Node{
        String item;
        Node next;
    }

    private boolean isEmpty() {
        return first==null;
    }

    private void push(String item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
    }

    private String pop() {
        String item = first.item;
        first = first.next;
        return item;
    }

    public static void main(String[] args) {
        LinkedStackOfStrings stack = new LinkedStackOfStrings();
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
