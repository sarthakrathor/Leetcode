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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        helper(root,ans,0);
        return ans;
    }

    void helper(TreeNode root,List<Integer> curr,int h){
        if(root == null){
            return;
        }

        if(h == curr.size()) curr.add(root.val);
        helper(root.right,curr,h+1);
        helper(root.left,curr,h+1);
    }
}