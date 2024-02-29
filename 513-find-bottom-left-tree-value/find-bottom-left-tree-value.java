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
    public int findBottomLeftValue(TreeNode root) {
        
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        TreeNode curr=null;

        while(!q.isEmpty())
        {
                 curr=q.poll();
                if(curr.right!=null)
                q.offer(curr.right);

                if(curr.left!=null)
                q.offer(curr.left);
                
        }
        return curr.val;
    }
}