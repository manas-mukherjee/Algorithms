package sedgewick_algo.course1.week2_stack_queue_basicsort.queue;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class LinkedQueueOfStrings {

    private Node first, last;

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

    private void enqueue(String item) {
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;

        if(isEmpty()){
            first = last;
        }else {
            oldLast.next = last;
        }
    }

    private String dequeue() {
        if(!isEmpty()){
            String item = first.item;
            first = first.next;
            return item;
        }else{
            last = null;
            return null;
        }
    }

    public static void main(String[] args) {
        LinkedQueueOfStrings queue = new LinkedQueueOfStrings();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();

            if(item.equals("-")){
                StdOut.print(queue.dequeue());
            }else {
                queue.enqueue(item);
            }
        }
    }
}
