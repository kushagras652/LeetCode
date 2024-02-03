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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1)
        return new TreeNode(val,root,null);

        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int level=1;

        while(!q.isEmpty() && depth>level){
            int size=q.size();

            for(int i=0;i<size;++i){
                TreeNode curr=q.poll();
                if(depth-1==level){
                curr.left=new TreeNode(val,curr.left,null);
                curr.right=new TreeNode(val,null,curr.right);
                }
                else{
                    if(curr.left!=null)
                    q.offer(curr.left);
                    if(curr.right!=null)
                    q.offer(curr.right);
                }
            }
            level++;
        }
        return root;
    }
}