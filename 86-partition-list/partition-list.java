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
    public ListNode partition(ListNode head, int x) {
        ListNode f=new ListNode(0);
        ListNode s=new ListNode(0);

        ListNode a=f;
        ListNode b=s;

        while(head!=null){
            if(head.val<x){
                a.next=new ListNode(head.val);
                a=a.next;
            }
            else{
                b.next=new ListNode(head.val);
                b=b.next;
            }
            head=head.next;
        }
        a.next=s.next;
        return f.next;
    }
}