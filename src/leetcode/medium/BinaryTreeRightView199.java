package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightView199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ret = new ArrayList<Integer>();

        rightView(root, ret, 0);
        return ret;
    }

    private void rightView(TreeNode currNode, List<Integer> ret, int currDepth) {
        if(currNode==null){
            return;
        }

        if(currDepth == ret.size()){
            ret.add(currNode.val);
        }

        rightView(currNode.right, ret, currDepth+1);
        rightView(currNode.left, ret, currDepth+1);
    }

    public static void main(String args[]) {
        BinaryTreeRightView199 obj = new BinaryTreeRightView199();


        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(3);

        TreeNode c = new TreeNode(5);
        TreeNode d = new TreeNode(4);

        TreeNode root = new TreeNode(1);
        root.left = a;
        root.right = b;

        a.right = c;
        b.right = d;

        List<Integer> rightnodes = obj.rightSideView(root);
        for(Integer i : rightnodes){
            System.out.println(i);
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

}
