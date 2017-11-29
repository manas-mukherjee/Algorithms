package CTCI.treesgraph;

public class TreeTraversal {

    public static void main(String args[]) {
        TreeNode root = setupData();

        TreeTraversal obj = new TreeTraversal();
        obj.inOrder(root);
        System.out.println("\n----------------");
        obj.preOrder(root);
        System.out.println("\n----------------");
        obj.postOrder(root);

        System.out.println("Tree size");
        System.out.println(obj.findTreeSize(root));
    }

    private int findTreeSize(TreeNode root) {
        if (root == null){
            return 0;
        }
        return (findTreeSize(root.left)+1+findTreeSize(root.right));
    }


    private void inOrder(TreeNode root) {
        if(root!=null){
            inOrder(root.left);
            visit(root);
            inOrder(root.right);
        }
    }

    private void preOrder(TreeNode root) {
        if(root!=null){
            visit(root);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    private void postOrder(TreeNode root) {
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            visit(root);
        }
    }

    private void visit(TreeNode root) {
        System.out.print(root.val + " ");
    }

    private static TreeNode setupData() {
        TreeNode root = new TreeNode(10);
        TreeNode l2 = new TreeNode(5);
        TreeNode l3 = new TreeNode(20);
        TreeNode l4 = new TreeNode(9);
        TreeNode l5 = new TreeNode(18);
        TreeNode l6 = new TreeNode(3);
        TreeNode l7 = new TreeNode(7);

        root.left = l2;
        root.right = l3;

        l2.left = l4;
        l2.right = l5;

        l3.left = l6;
        l3.right = l7;

        return root;
    }

}
