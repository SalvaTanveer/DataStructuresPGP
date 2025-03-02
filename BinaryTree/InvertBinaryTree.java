package BinaryTree;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        TreeNode temp = left;
        root.left = root.right;
        root.right = temp;

        return root;
    }
}
