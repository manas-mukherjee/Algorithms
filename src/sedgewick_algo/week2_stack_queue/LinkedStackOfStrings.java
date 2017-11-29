package sedgewick_algo.week2_stack_queue;
import edu.princeton.cs.algs4.*;

public class LinkedStackOfStrings{

    private Node first = null;

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
            if (!item.equals("-"))
                stack.push(item);
            else if (!stack.isEmpty())
                StdOut.print(stack.pop() + " ");
        }
        //StdOut.println("(" + stack.size() + " left on stack)");
    }
}
