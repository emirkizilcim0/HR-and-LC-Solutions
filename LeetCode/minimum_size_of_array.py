class Solution:
    def minSubArrayLen(self, target, nums):
        
        left, right = 0, len(nums)

        while left < right:
            print(nums[left:right])
            if sum(nums[left:right]) > target:
                right -= 1
            elif sum(nums[left:right]) < target:
                left += 1
            else:
                break
        return len(nums[left:right])
    
a = Solution()
print(a.minSubArrayLen(target = 7, nums = [2,3,1,2,4,3]))
 