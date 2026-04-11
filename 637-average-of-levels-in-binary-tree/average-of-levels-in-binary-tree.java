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
        // System.out.println("hello");
        while(!q.isEmpty()){
            int size=q.size();
            double sum=0;
            // System.out.println(sum);
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                sum+=node.val;
                if(node.left!=null)
                q.add(node.left);
                if(node.right!=null)
                q.add(node.right);
            }
            // System.out.println(sum);
            double avg=sum/size;
            list.add(avg);
        }
        return list;
    }
}