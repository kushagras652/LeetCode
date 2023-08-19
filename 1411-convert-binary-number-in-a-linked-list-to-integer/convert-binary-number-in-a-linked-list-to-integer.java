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
    public int getDecimalValue(ListNode head) {
        // if(head.val==0){
        //     return 0;
        // }
        ArrayList<Integer> list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
       int size=list.size();
       int  sum=0;
        for(int i=size-1;i>=0;i--){
            sum+=(list.get(i))*Math.pow(2,size-1-i);
        }
        return sum;
    }
}