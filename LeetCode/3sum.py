def threeSum(nums):
    nums.sort()
    res = []
    
    for i in range(len(nums) - 2):
        if i > 0 and nums[i] == nums[i-1]:
            continue
        
        front = i + 1
        back = len(nums) - 1
        while front < back:
            if nums[front] + nums[i] + nums[back] == 0:
                res.append([nums[front],nums[i],nums[back]])
                front += 1
                back -= 1
                
                #skipping the duplicates.
                while front < back and nums[front] == nums[front-1]: 
                    front += 1
                while front < back and nums[back] == nums[back+1]:
                
                    back -= 1
            elif nums[front] + nums[i] + nums[back] < 0:
                front += 1
            else:
                back -= 1
    return res

print(threeSum(nums = [-1,0,1,2,-1,-4]))
print(threeSum(nums= [0,1,1]))
print(threeSum(nums = [0,0,0]))