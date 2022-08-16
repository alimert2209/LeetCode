class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        liste = []
        for i in nums1:
            #print(i)
            idx = nums2.index(i)
            try:
                for j in range(1, len(nums2)): 
                    if nums2[idx] < nums2[idx+j]:
                        liste.append(nums2[idx+j])
                        break
                else:
                    liste.append(-1)
            except:
                #print(i)
                liste.append(-1)
        return liste