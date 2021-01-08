 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if(head == null)
            return false;

        ListNode former = head.next;
        ListNode latter = null;
        if(former != null){
            latter = former.next;
        }

        while(former != null && latter != null){
            if(former == latter)return true;
            former = former.next;
            latter = latter.next == null ?  null :  latter.next.next;

        }
        return false;
    }
}