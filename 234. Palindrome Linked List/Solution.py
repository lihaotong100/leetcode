class Solution:
    def isPalindrome(self, head: ListNode) -> bool:
        if not head or not head.next:
            return True

        fast = slow = head
        reverse_list = None
        while(fast is not None and fast.next is not None):
            pre = slow

            fast = fast.next.next
            slow = slow.next

            pre.next = reverse_list
            reverse_list = pre

            
        if fast is not None:
            slow = slow.next
            
        while reverse_list is not None and reverse_list.val == slow.val:
            reverse_list = reverse_list.next
            slow = slow.next

        return reverse_list is None
        
