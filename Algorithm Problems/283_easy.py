class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        count = 0
        for i in range(0, len(nums)):
            if nums[i] == 0:
                count += 1
    
        for j in range(count):
            nums.remove(0)
            nums.append(0)