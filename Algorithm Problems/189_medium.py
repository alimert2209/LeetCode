class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        
        while k > 0:
            temp = nums.pop()
            nums.insert(0,temp)
            k-=1
        return nums