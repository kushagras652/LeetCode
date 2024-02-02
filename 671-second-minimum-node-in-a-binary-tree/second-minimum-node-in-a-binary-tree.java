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
    public int findSecondMinimumValue(TreeNode root) {
        Set<Integer> set = new HashSet<>();
        tree(root, set);
        TreeSet<Integer> sortedSet = new TreeSet<>(set);
        sortedSet.pollFirst();
        if (sortedSet.size() != 0)
            return sortedSet.first();
        return -1;
    }

    public void tree(TreeNode root, Set<Integer> set) {
        if (root == null)
            return;
        set.add(root.val);
        tree(root.left, set);
        tree(root.right, set);
    }
}