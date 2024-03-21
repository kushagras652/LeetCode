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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode head = list1;
        ListNode temp1 = list1;
        ListNode temp2 = list1;
        
        for (int i = 0; i < a - 1; i++) {
            temp1 = temp1.next;
        }
        
        for (int i = 0; i < b; i++) {
            temp2 = temp2.next;
        }
       
        temp1.next = list2;
        
        ListNode tailList2 = list2;
        while (tailList2.next != null) {
            tailList2 = tailList2.next;
        }

        tailList2.next = temp2.next;
        
        return head;
    }
}