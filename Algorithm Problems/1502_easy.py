class Solution:
    def canMakeArithmeticProgression(self, arr: List[int]) -> bool:
        arr.sort()
        i = 0
        count = 0
        if len(arr) > 2:
            while i < len(arr) - 2:
                if arr[i] - arr[i+1] == arr[i+1] - arr[i+2]:
                    count += 1
                    i+=1
                else:
                    return False
            if count == len(arr) - 2:
                return True
        return True
            
        