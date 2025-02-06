/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        
        int lh = height(root.left);
        int rh = height(root.right);

        boolean c1 = Math.abs(lh-rh) <= 1;
        boolean c2 = isBalanced(root.left);
        boolean c3 = isBalanced(root.right);
        return c1 && c2 && c3;
    }

    int height(TreeNode temp){
        if(temp == null) return 0;
        int l = height(temp.left);
        int r = height(temp.right);
        return Math.max(l,r)+1;
    }
}