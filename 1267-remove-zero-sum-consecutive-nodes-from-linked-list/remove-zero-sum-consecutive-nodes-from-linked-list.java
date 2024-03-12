/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
          ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        HashMap<Integer, ListNode> map = new HashMap<>();
        int sum = 0;
        
        ListNode current = dummy;
        
        while (current != null) {
            sum += current.val;
            if (map.containsKey(sum)) {
                // Found a sublist with sum 0, remove nodes between current and the node with sum
                ListNode prev = map.get(sum).next;
                int tempSum = sum;
                while (prev != current) {
                    tempSum += prev.val;
                    map.remove(tempSum);
                    prev = prev.next;
                }
                // Update the next pointer of the node with sum
                map.get(sum).next = current.next;
            } else {
                // Store the cumulative sum and its corresponding node
                map.put(sum, current);
            }
            current = current.next;
        }
        
        return dummy.next;
    }
}