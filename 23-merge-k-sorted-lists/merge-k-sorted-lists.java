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
    public ListNode mergeKLists(ListNode[] lists) {
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        for(ListNode head:lists){
            while(head!=null){
                pq.add(head.val);
                map.put(head.val,map.getOrDefault(head.val,0)+1);
                head=head.next;
            }
        }

        ListNode dummy =new ListNode(0);
        ListNode current=dummy;

        while(!pq.isEmpty()){
            int val=pq.poll();
            ListNode newNode=new ListNode(val);
            current.next=newNode;
            current=current.next;

            Integer count=map.get(val);
            if(count!=null && count>0){
                map.put(val,count-1);
            }
            else{
                map.remove(val);
            }
        }

        return dummy.next;
    }
}