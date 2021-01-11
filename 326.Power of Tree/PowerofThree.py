from math import log
class Solution:
    def isPowerOfThree(self, n: int) -> bool:
        if n < 1:
            return False
        x = round(log(n,3))
        return 3**x == n
