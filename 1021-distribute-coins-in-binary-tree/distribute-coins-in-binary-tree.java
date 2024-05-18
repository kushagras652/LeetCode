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
    int moves;
    public int distributeCoins(TreeNode root) {
        moves=0;
        coins(root);
        return moves;
    }
    public int coins(TreeNode node){
        if(node==null)
        return 0;

        int left=coins(node.left);
        int right=coins(node.right);

        moves+=Math.abs(left)+Math.abs(right);

        return node.val+left+right-1;
    }
}