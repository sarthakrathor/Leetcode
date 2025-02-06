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
        return helper(root) != -1;
    }

    int helper(TreeNode temp){
        if(temp == null) return 0;
        
        //case 1 for checking if lest subtree is balanced or not
        int left = helper(temp.left);
        if(left == -1) return -1;
        
        //case 2 for checking if right subtree is balanced or not
        int right = helper(temp.right);
        if(right == -1) return -1;
        
        //case 3 for checking if complete tree is balanced or not
        if(Math.abs(left-right) > 1) return -1;

        return Math.max(left,right)+1;
    }
}