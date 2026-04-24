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
        // ArrayList<Integer> list=new ArrayList<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        small(root,pq,k);
        // Collections.sort(list);
        return pq.peek();
    }
    public void small(TreeNode root,PriorityQueue<Integer> pq,int k){
        if(root==null)
        return ;

        pq.add(root.val);
        
        if(pq.size()>k)
        pq.poll();
        
        small(root.left,pq,k);
        small(root.right,pq,k);
        // if(root.left!=null){
        //     list.add(root.val);
        //     small(root.left,list);
        // }
        // if(root.right!=null){
        //     list.add(root.val)
        // }
    }
}