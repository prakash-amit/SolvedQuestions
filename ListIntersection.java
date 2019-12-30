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
public class ListIntersection {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if( headA == null || headB == null ) {
            return null;
        }

        int lengthOfListA = listLength( headA );
        int lengthOfListB = listLength( headB );

        ListNode tempA = headA;
        ListNode tempB = headB;

        if( lengthOfListA > lengthOfListB ) {
            while( lengthOfListA - lengthOfListB > 0 ) {
                tempA = tempA.next;
                --lengthOfListA;
            }
        }
        else if( lengthOfListB > lengthOfListA ) {
            while( lengthOfListB - lengthOfListA > 0 ) {
                tempB = tempB.next;
                --lengthOfListB;
            }
        }

        while( tempA != null && tempB != null ) {
            if( tempA == tempB ) {
                return tempA;
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }

        return null;
    }

    private static int listLength( ListNode head ) {
        ListNode temp = head;
        int count = 0;
        while( temp != null ) {
            ++count;
            temp = temp.next;
        }

        return count;
    }
}
