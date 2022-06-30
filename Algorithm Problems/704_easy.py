class Solution:
    def search(self, nums: List[int], target: int) -> int:
        if target in nums:
            for i in range(len(nums)):
                if nums[i] == target:
                    return i
        else:
            return -1