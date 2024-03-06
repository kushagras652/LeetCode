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
    public TreeNode trimBST(TreeNode root, int low, int high) {
        //my thinkin gis correct but not its very complex as well 
        //it is  not able to maintain order
    //     ArrayList<Integer> list=new ArrayList<>();
    //     inorder(root,list,low,high);

    //     if(list.size()==0)
    //     return null;

    //  //   Collections.sort(list);

    //     return bst(list,0,list.size()-1);
    // }
    // public void inorder(TreeNode root,ArrayList<Integer> list,int low,int high){
    //     if(root==null)
    //     return;
    //     inorder(root.left,list,low,high);
    //     if(root.val>=low && root.val<=high)
    //     list.add(root.val);
    //     inorder(root.right,list,low,high);
    // }
    // private TreeNode bst(ArrayList<Integer> list,int left,int right){
    //      if (left > right) {
    //         return null;
    //     }

    //     // Choose the middle element as the root
    //     int mid = left + (right - left) / 2;
    //     TreeNode root = new TreeNode(list.get(mid));

    //     // Recursively form left and right subtrees
    //     root.left = bst(list, left, mid - 1);
    //     root.right = bst(list, mid + 1, right);

    //     return root;

    if(root==null)
    return null;
    root.left=trimBST(root.left,low,high);
    root.right=trimBST(root.right,low,high);
    if(root.val<low)
    return root.right;
    if(root.val>high)
    return root.left;
    return root;
    }
}