/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l = null;
        ListNode t1 = null;
        ListNode t2 = null;
        ListNode t = null;

        if( l1 == null ) return l2;
        if( l2 == null ) return l1;

        if( l1.val <= l2.val ) {
            l = l1;
            t1 = l1.next;
            t2 = l2;
        }
        else {
            l = l2;
            t1 = l1;
            t2 = l2.next;
        }

        t = l;

        while( t1 != null && t2 != null ) {
            if( t1.val <= t2.val ) {
                t.next = t1;
                t1 = t1.next;
            }
            else {
                t.next = t2;
                t2 = t2.next;
            }
                t = t.next;
        }

        if( t1 != null ) {
            t.next = t1;
        }
        if( t2 != null ) {
            t.next = t2;
        }

        return l;

    }
}
