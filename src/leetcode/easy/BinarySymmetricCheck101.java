package leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySymmetricCheck101 {

    public boolean isSymmetric(TreeNode root) {
        return root==null || isSymmetricHelp(root.left, root.right);
    }

    // Recursive approach
    private boolean isSymmetricHelp(TreeNode left, TreeNode right) {
        if(left==null || right==null)
            return left==right;
        if(left.val!=right.val)
            return false;
        else
            return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
    }

    // Iterative
    public boolean isSymmetricIterative(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        if(root == null) return true;
        q.add(root.left);
        q.add(root.right);
        while(q.size() > 1){
            TreeNode left = q.poll(),
                    right = q.poll();
            if(left== null&& right == null) continue;
            if(left == null ^ right == null) return false;
            if(left.val != right.val) return false;
            q.add(left.left);
            q.add(right.right);
            q.add(left.right);
            q.add(right.left);
        }
        return true;
    }

    public static void main(String args[]) {
        int[] input = {1, 2, 2, 3, 4, 4, 3};

        TreeNode root = null;

        TreeNode n1 = new TreeNode(1);
        TreeNode n21 = new TreeNode(2);
        TreeNode n22 = new TreeNode(2);
        TreeNode n31 = new TreeNode(3);
        TreeNode n41 = new TreeNode(4);
        TreeNode n42 = new TreeNode(4);
        TreeNode n32 = new TreeNode(3);

        n1.left = n21;
        n21.left = n31;
        n21.right = n41;

        n1.right = n22;
        n22.left = n42;
        n22.right = n32;

        root = n1;

        boolean check = new BinarySymmetricCheck101().isSymmetric(root);
        System.out.println("check - " + check);

        check = new BinarySymmetricCheck101().isSymmetricIterative(root);
        System.out.println("check - " + check);
    }
}
