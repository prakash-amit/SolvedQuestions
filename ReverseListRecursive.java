/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class ReverseListRecursive {

    public  ListNode reverseList(ListNode head) {
        if( head == null || head.next == null ) return head;

        ListNode reversedHead = reverseList( head.next );

        head.next.next = head;
        head.next = null;

        return reversedHead;
    }

}
