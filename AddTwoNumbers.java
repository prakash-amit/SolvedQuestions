/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if( l1 == null )return l2;
        if( l2 == null )return l1;


        ListNode temp = new ListNode( (l1.val + l2.val) % 10);
        int carry = (l1.val + l2.val)/10;

        ListNode temp3 = temp;

        ListNode temp1 = l1.next;
        ListNode temp2 = l2.next;

        while( temp1 != null && temp2 != null ) {
            temp3.next = new ListNode( (temp1.val + temp2.val + carry ) % 10);
            carry =  (temp1.val + temp2.val + carry ) / 10;
            temp1 = temp1.next;
            temp2 = temp2.next;
            temp3 = temp3.next;
        }
        while( temp1 != null ) {
            temp3.next = new ListNode( (temp1.val + carry ) % 10);
            carry =  (temp1.val + carry) / 10;
            temp1 = temp1.next;
            temp3 = temp3.next;
        }

        while( temp2 != null ) {
            temp3.next = new ListNode( (temp2.val + carry ) % 10);
            carry =  (temp2.val + carry) / 10;
            temp2 = temp2.next;
            temp3 = temp3.next;
        }

        if( carry > 0 ) {
            temp3.next = new ListNode( carry );
        }
       return temp;
    }
}
