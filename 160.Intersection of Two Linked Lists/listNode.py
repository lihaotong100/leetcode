# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> ListNode:
        node1 = headA
        node2 = headB
        len1 = 1
        len2 = 1
        if node1 is None or node2 is None:
            return None;
        while node1 is not None:
            len1 += 1
            node1 = node1.next
        while node2 is not None:
            len2 += 1
            node2 = node2.next

        node1,node2 = headA,headB
        if(len1 > len2):
            for i in range(len1 - len2):
                node1 = node1.next
        else:
            for i in range(len2 - len1):
                node2 = node2.next

        while(node1 is not node2):
            node1 = node1.next
            node2 = node2.next

        return node1