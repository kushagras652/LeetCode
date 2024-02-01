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
    public long kthLargestLevelSum(TreeNode root, int k) {
          PriorityQueue<Long> result=new PriorityQueue<>(k);
        if(root==null){
            return -1;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
    

        while(!queue.isEmpty()){
         int levelSize = queue.size();

           long sum=0;
            for (int i = 0; i < levelSize; i++) {
                TreeNode curr = queue.poll();
               sum+=curr.val;

                if (curr.left != null) {
                    queue.offer(curr.left);
                }
                if (curr.right != null) {
                    queue.offer(curr.right);
                }
            }
            result.add(sum);

            if (result.size() > k) {
                result.poll();
            }
        }
       
        return result.size() == k ? result.peek() : -1;
    }
}