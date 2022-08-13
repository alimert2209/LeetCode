class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        my_list = [int(x) for x in str(n)]
        #print(my_list)
        #print(math.prod(my_list))
        return math.prod(my_list) - sum(my_list)