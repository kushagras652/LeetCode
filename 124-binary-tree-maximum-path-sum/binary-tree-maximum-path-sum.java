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
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        // int[] max=new int[1];
        maxPath(root);
        return max;

    }
    int maxPath(TreeNode node){
        if(node==null)
        return Integer.MIN_VALUE;
        int left=Math.max(0,maxPath(node.left));
        int right=Math.max(0,maxPath(node.right));
        max=Math.max(max,left+right+node.val);
        return Math.max(left,right)+node.val;
    }
}