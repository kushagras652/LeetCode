/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if (root == null)
            return null;

        if (root.left != null) {
            if (root.right != null) {
                root.left.next = root.right;
            } else if (root.next != null) {
                Node current = root.next;
                while (current != null && current.left == null && current.right == null) {
                    current = current.next;
                }
                root.left.next = (current != null) ? (current.left != null ? current.left : current.right) : null;
            }
        }

        if (root.right != null && root.next != null) {
            Node current = root.next;
            while (current != null && current.left == null && current.right == null) {
                current = current.next;
            }
            root.right.next = (current != null) ? (current.left != null ? current.left : current.right) : null;
        }

        connect(root.right); // Make sure to connect right subtree first
        connect(root.left);

        return root;
    }
}