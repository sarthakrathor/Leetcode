/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> pAn = new ArrayList<>();
        List<TreeNode> qAn = new ArrayList<>();

        find(root,p,pAn);
        find(root,q,qAn);

        for(TreeNode i:pAn){
            if(qAn.contains(i)) return i;
        }

        return null;
    }

    boolean find(TreeNode root,TreeNode target,List<TreeNode> curr){
        if(root == null) return false;
        if(root == target){
            curr.add(root);
            return true;
        }

        boolean fl = find(root.left,target,curr);
        boolean rl = find(root.right,target,curr);

        if(fl || rl){
            curr.add(root);
            return true;
        }

        return false;
    }
}