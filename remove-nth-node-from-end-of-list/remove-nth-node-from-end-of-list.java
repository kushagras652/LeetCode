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
        if(head==null ){
            return head;
        }

        ListNode reverse=reverseList(head);
        ListNode temp=reverse;
      
        if(n==1){
          reverse= reverse.next;
          return reverseList(reverse);
        }
             for(int i=0;i<n-2;i++){
           temp=temp.next;
        }
        temp.next=temp.next.next;
        ListNode result=reverseList(reverse);
       return result;
    }
     public  ListNode reverseList(ListNode head){
           ListNode prev=null;
       ListNode present=head;
      
       while(present!=null){
            ListNode next=present.next;
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