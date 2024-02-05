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
    public TreeNode reverseOddLevels(TreeNode root) {
        if(root==null)
        return root;

        int level=0;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int size=q.size();
           while(size-- >0){
               TreeNode curr=q.poll();
               if(curr.left!=null)
               q.offer(curr.left);
               if(curr.right!=null)
               q.offer(curr.right);
           }
           level++;
           if(level%2==1 && !q.isEmpty()){
               int[] nums=new int[q.size()];
               int i=0;
               for(TreeNode node:q){
                   nums[i++]=node.val;
               }
               int j=q.size()-1;
               for(TreeNode node:q){
                   node.val=nums[j--];
               }
           }
        }
        return root;
    }
}