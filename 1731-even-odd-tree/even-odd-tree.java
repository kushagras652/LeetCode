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
    public boolean isEvenOddTree(TreeNode root) {
        int level=0;

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size=q.size();
            Integer prev=null;

            for(int i=0;i<size;++i){
                TreeNode curr=q.poll();

                  if ((level % 2 == 0 && (curr.val % 2 == 0 || (prev != null && curr.val <= prev)))
                        || (level % 2 != 0 && (curr.val % 2 != 0 || (prev != null && curr.val >= prev)))) {
                    return false;
                }

                  prev=curr.val;

                     if(curr.left!=null)
                        q.offer(curr.left);
                        if(curr.right!=null)
                        q.offer(curr.right);
            }
            level++;
        }
        return true;
    }
}