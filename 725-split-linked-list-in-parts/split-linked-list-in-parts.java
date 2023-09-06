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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int n=count/k;
        int a=count%k;
        temp=head;
        ListNode[] list=new ListNode[k];
        for(int i=0;i<k;i++){
            int parts=n+(i<a?1:0);
            if(parts==0){
                list[i]=null;
            }
            else{
                list[i]=temp;
                for(int j=1;j<parts;j++){
                    temp=temp.next;
                }
                ListNode nextNode=temp.next;
                temp.next=null;
                temp=nextNode;
            }
        }
        return list;
    }
}