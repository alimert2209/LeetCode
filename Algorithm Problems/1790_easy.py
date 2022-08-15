class Solution:
    def areAlmostEqual(self, s1: str, s2: str) -> bool:
        count = 0
        if s1 == s2:
            return True
        elif len(s1) == len(s2) and sorted(s1) == sorted(s2):
            for i in range(0, len(s1)):
                if s1[i] != s2[i]:
                    count += 1
            if count == 0 or count == 2:
                return True
            else:
                return False
        else:
            return False