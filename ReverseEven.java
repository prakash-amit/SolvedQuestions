class reverseEven{
 public static LinkedListNode reverse_even_nodes( LinkedListNode head ) {
      LinkedListNode oddHead = head;
      LinkedListNode evenHead = null;

      LinkedListNode temp = head.next;
      LinkedListNode temp1 = oddHead;


      boolean odd = false;

      while( temp != null ) {
           if( odd ) {
                temp1.next = temp;
                temp1 = temp1.next;
                temp = temp.next;
                odd = false;
           }
           else {
                LinkedListNode next = temp.next;
                temp.next = evenHead;
                evenHead = temp;
                temp = next;
                odd = true;
           }
      }

      temp1.next = null;

      temp1 = oddHead.next;
      LinkedListNode temp2 = evenHead;
      LinkedListNode mergedHead = oddHead;
      temp = mergedHead;

      odd = false;

      while( temp1 != null && temp2 != null ) {
           if( odd ) {
                temp.next = temp1;
                temp1 = temp1.next;
                odd = false;
           }
           else {
                temp.next = temp2;
                temp2 = temp2.next;
                odd = true;
           }
           temp = temp.next;
      }
      if( temp1 != null ) {
           temp.next = temp1;
      }
      if( temp2 != null ) {
           temp.next = temp2;
      }

       return mergedHead;
  }
}
