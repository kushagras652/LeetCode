/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
       if (head == null) return null;
        
        // Step 1: Clone each node and insert it after the original node
        Node current = head;
        while (current != null) {
            Node copy = new Node(current.val);
            copy.next = current.next;
            current.next = copy;
            current = copy.next;
        }
        
        // Step 2: Update the random pointers for the copied nodes
        current = head;
        while (current != null) {
            if (current.random != null) {
                current.next.random = current.random.next;
            }
            current = current.next.next;
        }
        
        // Step 3: Separate the original list and the copied list
        current = head;
        Node copiedHead = head.next;
        Node copiedCurrent = copiedHead;
        while (current != null) {
            current.next = current.next.next;
            current = current.next;
            if (copiedCurrent.next != null) {
                copiedCurrent.next = copiedCurrent.next.next;
                copiedCurrent = copiedCurrent.next;
            }
        }
        
        return copiedHead;
    }
}