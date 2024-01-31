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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return maxElement(nums,0,nums.length-1);
    }
    public TreeNode maxElement(int[] arr,int start,int end){
        if(start>end)
        return null;

        int maxIndex=maxIndex(arr,start,end);
        TreeNode root=new TreeNode(arr[maxIndex]);
        
         root.left = maxElement(arr, start, maxIndex - 1);
        root.right = maxElement(arr, maxIndex + 1, end);

        return root;
    }
    public int maxIndex(int[] arr,int start,int end){
         int maxIndex=start;
        for(int i=start+1;i<=end;i++){
            if(arr[maxIndex]<arr[i])
            maxIndex=i;
        }
        return maxIndex;
    }
}