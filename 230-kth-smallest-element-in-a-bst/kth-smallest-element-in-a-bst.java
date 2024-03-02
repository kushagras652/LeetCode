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
    public int kthSmallest(TreeNode root, int k) {
        Queue<Integer> pq=new PriorityQueue<>();
        inOrder(root,pq);
        while(k!=1){
            pq.poll();
            k--;
        }
        return pq.poll();
    }
    public void inOrder(TreeNode root,Queue<Integer> pq){
        if(root!=null){
            inOrder(root.left,pq);
            pq.offer(root.val);
            inOrder(root.right,pq);
        }
    }
}