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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3=reverse(l1);
        ListNode l4=reverse(l2);
         ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        while (l3 != null || l4 != null) {
            int sum = carry;

            if (l3 != null) {
                sum += l3.val;
                l3 = l3.next;
            }

            if (l4 != null) {
                sum += l4.val;
                l4 = l4.next;
            }

            carry = sum / 10;
            sum %= 10;

            current.next = new ListNode(sum);
            current = current.next;
        }

        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        return reverse(dummyHead.next);
    }
     public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode current=head;
      
        while(current!=null){
              ListNode next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        //    while(next!=null){
        //        next=next.next;
        //    }
        }
        return prev;
    }
}