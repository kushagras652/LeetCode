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
    public ListNode mergeNodes(ListNode head) {
         ListNode node = head.next;
        ListNode list = new ListNode();
        head = list;

        int sum = 0;
        while(node != null) {
            if(node.val == 0) {
                list.next = new ListNode(sum);
                list = list.next;
                sum = 0;
            } else {
                sum += node.val;
            }
            node = node.next;
        }
        return head.next;
    }
    }
