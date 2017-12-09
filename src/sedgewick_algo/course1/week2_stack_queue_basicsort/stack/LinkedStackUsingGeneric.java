package sedgewick_algo.course1.week2_stack_queue_basicsort.stack;

import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;
import java.util.ListIterator;

public class LinkedStackUsingGeneric<Item> implements Iterable<Item>{

    private Node first = null;

    @Override
    public Iterator<Item> iterator() {

        return new ListIterator<Item>() {
            private Node current = first;

            @Override
            public boolean hasNext() {
                return current !=null;
            }

            @Override
            public Item next() {
                Item item = current.item;
                current = current.next;
                return item;
            }

            @Override
            public boolean hasPrevious() {
                return false;
            }

            @Override
            public Item previous() {
                return null;
            }

            @Override
            public int nextIndex() {
                return 0;
            }

            @Override
            public int previousIndex() {
                return 0;
            }

            @Override
            public void remove() {

            }

            @Override
            public void set(Item genericItem) {

            }

            @Override
            public void add(Item genericItem) {

            }
        };

    }

    /*
        Size : 40 byes
        Class : 16 bytes
        Inner-Class : 8 bytes
        item : ref to GenericItem - 8 bytes
        Node : ref to Node - 8 bytes
     */
    private class Node{
        Item item;
        Node next;
    }

    private boolean isEmpty() {
        return first==null;
    }

    private void push(Item item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
    }

    private Item pop() {
        Item item = first.item;
        first = first.next;
        return item;
    }

    public static void main(String[] args) {
        LinkedStackUsingGeneric<String> stack = new LinkedStackUsingGeneric<String>();
        stack.push("hello");
        stack.push("world");

        for(String item: stack){
            StdOut.print(item + " ");
        }
    }
}
