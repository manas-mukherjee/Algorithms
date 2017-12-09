package sedgewick_algo.interview;

import java.util.*;

/**
 * Given two nodes of a tree,
 * method should return the deepest common ancestor of those nodes.
 *
 *          A
 *         / \
 *        B   C
 *       / \
 *      D   E
 *         / \
 *        G   F
 *
 *  commonAncestor(D, F) = B
 *  commonAncestor(C, G) = A
 *  commonAncestor(E, B) = B

 commonAncestor(Node n1, Node n2)
 */
     /*
     G, E -
     E, B
     B, A

     F, E
     D, B
     C, A ---
     A, null
     */

public class CommonAncestor{

//    HashMap<String, String> map;
//
//    CommonAncestor(){
//        map = new HashMap<String, String>();
//    }
//
//
//    private class Node{
//        String value;
//        Node parent;
//        Node left, right;
//
//        public Node getParent(){
//            return this.parent;
//        }
//
//        public String getValue(){
//            return this.value;
//        }
//    }
//
//    public int process(Node[] nodes){
//
//        for(int i=0; i<nodes.length; i++){
//            if(!this.map.contains(l.value){
//                this.map(value, l.getParent().getValue());
//            }
//        }
//        return 0;
//    }
//
//    public Node commonAncestor(Node l, Node r){
//        String firstIndex=null, secondIndex=null;
//
//        List<String> pathNodeValues = new ArrayList<String>();
//        List<String> pathNodeValues1 = new ArrayList<String>();
//
//        Node currentNode = l.getParent();
//        while(currentNode !=null){
//            firstIndex = this.map.get(currentNode.getValue()) //A
//            currentNode = currentNode.getParent();
//            pathNodeValues.add(firstIndex.getValue());
//        }
//
//        Node currentNode = r.getParent();
//        while(currentNode !=null){
//            secondIndex = this.map.get(currentNode.getValue()) //A
//            currentNode = currentNode.getParent();
//            pathNodeValues1.add(secondIndex.getValue());
//        }
//
//        Iterator<String> iter1 = pathNodeValues.iterator<String>();
//        Iterator<String> iter1 = pathNodeValues.iterator<String>();
//
//        while(true){
//            String l = iter1.next();
//            String r = iter2.next();
//            Collections.sort(pathNodeValues);
//            Collections.sort(pathNodeValues1);
//
//            if(iter1.next()==null){
//                while(iter2.hasNext()){
//                    r = iter2.next();
//                    if(l==r){
//                        break;
//                    }
//                }
//            }else if(iter2.next()==null){
//                while(iter1.hasNext()){
//                    l = iter1.next();
//                    if(l==r){
//                        break;
//                    }
//                }
//            }
//            return l;
//        }
//
//        return seconIndex;
//
//    }
//
//    public static void main(String args[]){
//        CommonAncestor obj = new CommonAncestor();
//        obj.constructTree();
//        obj.process();
//        obj.commonAncestor(new Node("D"), new Node("F"));
//    }
}
