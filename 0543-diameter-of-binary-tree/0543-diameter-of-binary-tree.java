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
        int[] dia = new int[1];
        dia(root,dia);
        return dia[0];
    }
    
    int dia(TreeNode temp,int[] maxi){
        if(temp == null) return 0;
        int l = dia(temp.left,maxi);
        int r = dia(temp.right,maxi);
        maxi[0] = Math.max(maxi[0],l+r);
        return Math.max(l,r)+1;
    }
}