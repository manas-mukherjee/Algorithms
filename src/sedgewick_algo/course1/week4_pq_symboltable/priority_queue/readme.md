Priority Queue

Remove the largest ( or smallest ) item.

public class MaxPQ<key extends Comparable<Key>>

MaxPQ()
void insert(Key v)
key delMax()
boolean isEmpty()


Complete binary tree ( Binary Heap )
Perfectly balanced except for the bottom level.
Height of complete tree with N nodes is [logN]


Binary heap representation
--------------------------

Parent's key no smaller than children's key..
Indices start a 1
Take nodes in the level order


--------------------------

Parent of Node at k is k/2
Children of Node at k are at 2k and 2k+1






