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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)
        return null;

        ListNode reverse=reverse(head);
        ListNode temp=reverse;

          if(n==1){
            reverse=reverse.next;
            return reverse(reverse);
          }

        for(int i=0;i<n-2;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return reverse(reverse);
    }
    ListNode reverse(ListNode head){
        if(head==null)
        return null;

        ListNode prev=null;
        ListNode present=head;
        ListNode next=present.next;

        while(present!=null){
            present.next=prev;
            prev=present;
            present=next;
            if(next!=null){
                next=next.next;
            }
        }
            return prev;
    }
}