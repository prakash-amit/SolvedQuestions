class rotateList{
   public static LinkedListNode rotate_list(LinkedListNode head, int n) {
     boolean leftRotation = true;
     if( n < 0 ) {
       leftRotation = false;
     }

     n = Math.abs( n );
     n = n % listLength( head );

     if( n == 0 ) return head;

     if( leftRotation ) {
       return rotateLeft( head, n );
     }
     else {
       return rotateRight( head, n );
     }
  }

  public static LinkedListNode rotateLeft(LinkedListNode head, int n) {
    LinkedListNode fast = head;
    while( n > 1 ) {
      if( fast == null ) return null;
      fast = fast.next;
      --n;
    }

    LinkedListNode current = head;
    LinkedListNode prev = null;

    while( fast.next != null ) {
      prev = current;
      current = current.next;
      fast = fast.next;
    }

    prev.next = null;
    fast = current;
    while( fast.next != null ) {
      fast = fast.next;
    }
    fast.next = head;
    head = current;

    return head;
  }

  public static LinkedListNode rotateRight(LinkedListNode head, int n) {
    LinkedListNode current = head;
    while( n > 1 ) {
      if( current == null ) return null;
      current = current.next;
      --n;
    }
    LinkedListNode next = current.next;
    current.next = null;

    LinkedListNode temp = next;
    while( temp.next != null ) {
      temp = temp.next;
    }
    temp.next = head;
    head = next;

    return head;
  }

    public static int listLength( LinkedListNode head ) {
    LinkedListNode temp = head;
    int length = 0;
    while( temp != null ) {
      ++length;
      temp = temp.next;
    }

    return length;
  }
}  
