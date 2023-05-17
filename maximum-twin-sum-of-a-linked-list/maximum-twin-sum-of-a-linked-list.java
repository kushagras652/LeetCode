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
    public int pairSum(ListNode head) {
        if(head==null || head.next==null){
            return -1;
        }
        ListNode mid=getMiddle(head);
        ListNode reversed=reverse(mid);
        ListNode list=reversed;
       // ListNode node=new ListNode();
        int sum=Integer.MIN_VALUE;
         //ListNode first=head;
       // ListNode second=reversed;
        while(head!=null && reversed!=null){
          sum=Math.max(sum,head.val+reversed.val);
          head=head.next;
          reversed=reversed.next;
        }
        reverse(list);
        return sum;
    }
    public ListNode getMiddle(ListNode head){
        ListNode fast=head; 
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode current=head;
        ListNode next=current.next;
        while(current!=null){
            current.next=prev;
            prev=current;
            current=next;
            if(next!=null){
                 next=next.next;
            }
        }
        return prev;
    }
}