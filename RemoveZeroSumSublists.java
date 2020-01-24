/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class RemoveZeroSumSublists {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummyHead = new ListNode( 0 );
        dummyHead.next = head;

        HashMap<Integer, ListNode> map = new HashMap<>();
        map.put( 0, dummyHead );

        int sum = 0;

        for( ListNode temp = dummyHead; temp != null; temp = temp.next ) {
           sum += temp.val;
            map.put( sum, temp );
        }

        sum = 0;
        for( ListNode temp = dummyHead; temp != null; temp = temp.next ) {
           sum += temp.val;
           temp.next = map.get( sum ).next;
        }


        return dummyHead.next;
    }
}
