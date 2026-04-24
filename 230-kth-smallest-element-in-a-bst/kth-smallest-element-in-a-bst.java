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
        ArrayList<Integer> list=new ArrayList<>();
        small(root,list);
        Collections.sort(list);
        return list.get(k-1);
    }
    public void small(TreeNode root,ArrayList<Integer> list){
        if(root==null)
        return ;

        list.add(root.val);
        small(root.left,list);
        small(root.right,list);
        // if(root.left!=null){
        //     list.add(root.val);
        //     small(root.left,list);
        // }
        // if(root.right!=null){
        //     list.add(root.val)
        // }
    }
}