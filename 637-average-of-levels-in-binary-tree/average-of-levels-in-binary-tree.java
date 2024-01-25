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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list=new ArrayList<>();
        if(root==null)
        return list;

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int level=q.size();
            List<Integer> a=new ArrayList<>();
            for(int i=0;i<level;i++){
            TreeNode curr=q.poll();
            a.add(curr.val);

            if(curr.left!=null)
            q.offer(curr.left);

            if(curr.right!=null)
            q.offer(curr.right);
            }
            double sum=0;
            for(int elem:a){
                sum+=elem;
            }
            double result=sum/a.size();
            list.add(result);
        }
        return list;
    }
}