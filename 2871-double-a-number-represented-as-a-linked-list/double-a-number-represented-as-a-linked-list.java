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
    public ListNode doubleIt(ListNode head) {

        //BELOW CODE IS CORRECT BUT IS NOT WORKING WHEN VALUE OF NUMBER 
        //BECOMES BIGGER THAN LONG DATATYPE


        // long num=0;
        // ListNode temp=head;
        // while(temp!=null){
        //     num=num*10+temp.val;
        //     temp=temp.next;
        // }
        // num=num*2;

        //   ListNode result = new ListNode((int)(num % 10));
        // num /= 10;
        // temp = result;
        // while (num > 0) {
        //     temp.next = new ListNode((int)(num % 10));
        //     num /= 10;
        //     temp = temp.next;
        // }
        
        // ListNode prev = null;
        // ListNode current = result;
        // ListNode nextNode = null;
        
        // while (current != null) {
        //     nextNode = current.next;
        //     current.next = prev;
        //     prev = current;
        //     current = nextNode;
        // }
        
        // return prev;

         if (head.val > 4)
            head = new ListNode(0, head);
        for(ListNode node = head; node != null; node = node.next) {
            node.val = (node.val * 2) % 10;
            if (node.next != null && node.next.val > 4)
                node.val++;
        }
        return head;


    }
}