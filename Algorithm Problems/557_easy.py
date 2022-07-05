class Solution:
    def reverseWords(self, s: str) -> str:
        list = s.split()
        for i in range(len(list)):
            list[i] = list[i][::-1]
        result = ' '.join(list)
        return result