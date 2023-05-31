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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> result=new ArrayList<>();
        List<Integer> result1=new ArrayList<>();
        tree(p,result);
        tree(q,result1);
       return result.equals(result1);
    }
    public void tree(TreeNode root,List<Integer> result){
        if(root==null){
            result.add(null);
            return;
        }
        result.add(root.val);
        tree(root.left,result);
        tree(root.right,result);
    }
}