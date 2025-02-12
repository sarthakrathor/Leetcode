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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> lst1 = new ArrayList<>();
        List<Integer> lst2 = new ArrayList<>();
        leaf(root1,lst1);
        leaf(root2,lst2);

        return lst1.equals(lst2);
    }

    List<Integer> leaf(TreeNode root, List<Integer> lst){
        if(root == null) return lst;
        if(root.left == null && root.right == null){
            lst.add(root.val);
        }
        leaf(root.left,lst);
        leaf(root.right,lst);
        return lst;
    }
}