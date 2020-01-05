/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class ReverseListIterative {
    public ListNode reverseList(ListNode head) {
        if( head == null || head.next == null ) {
            return head;
        }

        ListNode previousNode = null;
        ListNode currentNode = head;
        ListNode nextNode = null;

        while( currentNode != null ) {
            nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }

        return previousNode;
    }
}
