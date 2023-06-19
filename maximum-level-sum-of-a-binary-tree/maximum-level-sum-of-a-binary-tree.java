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
    public int maxLevelSum(TreeNode root) {
        if(root==null){
            return 0;
        }
        int maxLevel=1;
        int max=root.val;
        
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
      int currentLevel=1;
        while(!q.isEmpty()){
           int sum=0;
           int size=q.size();

           for(int i=0;i<size;i++){
               TreeNode currNode=q.poll();
            sum+=currNode.val;

            if(currNode.left!=null)
                q.offer(currNode.left);
            
            if(currNode.right!=null)
                q.offer(currNode.right);
           }
            if(sum>max){
               max=sum;
               maxLevel=currentLevel;
           }
           currentLevel++;
           }
            return maxLevel;
        }
        
    }
