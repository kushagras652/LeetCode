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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
       // ListNode first=new ListNode();
       ListNode mid=middle(head);
       ListNode reversed=reverseList(mid);
       ListNode list=reversed;
       while(head!=null && reversed!=null){
           if(head.val!=reversed.val){
               break;
           }
           else{
                head=head.next;
           reversed=reversed.next;
           }
       }
       reverseList(list);
       return head==null || reversed==null;
      
    }
    public  ListNode reverseList(ListNode head){
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
       public ListNode middle(ListNode head){
           ListNode slow=head;
           ListNode fast=head;
           while(fast!=null && fast.next!=null){
               slow=slow.next;
               fast=fast.next.next;
           }
           return slow;
       }
}