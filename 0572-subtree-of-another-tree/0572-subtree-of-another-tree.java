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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return helper(root,subRoot);
    }
    boolean helper(TreeNode root, TreeNode subRoot){
        if (root == null) return false; 
        boolean c1 = isSameTree(root,subRoot);
        boolean c2 = helper(root.left,subRoot);
        boolean c3 = helper(root.right,subRoot);
        return c1 || c2 || c3;
    }
    boolean isSameTree(TreeNode p, TreeNode q){
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null || p.val!=q.val){
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
    
}