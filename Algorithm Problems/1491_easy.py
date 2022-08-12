class Solution:
    def average(self, salary: List[int]) -> float:
        total = 0
        for i in salary:
            total += i
        
        total -= (max(salary) + min(salary))
        
        return total / (len(salary) - 2)