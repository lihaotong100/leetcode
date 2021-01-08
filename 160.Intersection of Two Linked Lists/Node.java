class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }


public class Node {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode node1 = headA,node2 = headB;
        int len1 = 0, len2 = 0;

        if(node1 == null || node2 == null)
            return null;

        while(node1 != null){
            len1++;
            node1 = node1.next;
        }
        while(node2 != null){
            len2++;
            node2 = node2.next;
        }

        if(len1 > len2){
            for(int i = 0;i < len1 - len2;i++){
                node1 = node1.next;
            }
        }else{
            for(int i = 0;i < len2 - len1;i++){
                node2 = node2.next;
            }
        }

        while (node1 != node2){
            node1 = node1.next;
            node2 = node2.next;
        }
        return node1;
    }
}
