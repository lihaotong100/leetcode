public class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode r = reverse(slow);

        while(r != null){
            if(r.val != head.val)return false;
            r = r.next;
            head = head.next;
        }

        return true;
    }

    public ListNode reverse(ListNode pointer){
        ListNode prev = null;
        while(pointer != null){
            ListNode next = pointer.next;
            pointer.next = prev;
            prev = pointer;
            pointer = next;
        }
        return prev;
    }
}


 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


