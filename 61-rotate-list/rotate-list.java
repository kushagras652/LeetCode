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
    public ListNode rotateRight(ListNode head, int k) {
          if (head == null || k == 0) {
            return head; 
        }
        
        ListNode temp = head;
        int count = 1;

        while (temp.next != null) {
            temp = temp.next;
            count++;
        }
        
        k %= count; 
        
        if (k == 0) {
            return head; 
        }

        temp.next = head;
        
        for (int i = 0; i < count - k; i++) {
            temp = temp.next;
        }
        
        head = temp.next;
        temp.next = null;
        
        return head;
    }
}