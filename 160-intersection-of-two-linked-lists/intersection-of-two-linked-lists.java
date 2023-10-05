/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null; // If either list is null, there can't be an intersection.
        }

        // Find the lengths of both linked lists.
        int lenA = getLength(headA);
        int lenB = getLength(headB);

        // Reset the pointers to the beginning of the lists.
        ListNode ptrA = headA;
        ListNode ptrB = headB;

        // Move the longer list's pointer ahead by the difference in lengths.
        if (lenA > lenB) {
            int diff = lenA - lenB;
            while (diff > 0) {
                ptrA = ptrA.next;
                diff--;
            }
        } else {
            int diff = lenB - lenA;
            while (diff > 0) {
                ptrB = ptrB.next;
                diff--;
            }
        }

        // Move both pointers simultaneously until they meet at the intersection point (or null).
        while (ptrA != null && ptrB != null) {
            if (ptrA == ptrB) {
                return ptrA; // Found the intersection point.
            }
            ptrA = ptrA.next;
            ptrB = ptrB.next;
        }

        return null;
    }
     private int getLength(ListNode head) {
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }
}