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
    public int diameterOfBinaryTree(TreeNode root) {
        return dia(root);
    }
    int dia(TreeNode root){
        int count = 0;
        if(root == null){
            return 0;
        }
        int d = height(root.left)+height(root.right);
        int d1 = dia(root.left);
        int d2 = dia(root.right);
        return Math.max(d,Math.max(d1,d2));
    }

    int height(TreeNode temp){
        if(temp == null) return 0;
        int l = height(temp.left);
        int r = height(temp.right);
        return Math.max(l,r)+1;
    }
}