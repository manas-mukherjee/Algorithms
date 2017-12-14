package leetcode.easy;

public class MaxDepth104 {

    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        else {
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        }
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

        int depth = new MaxDepth104().maxDepth(root);
        System.out.println("depth - " + depth);
    }
}
