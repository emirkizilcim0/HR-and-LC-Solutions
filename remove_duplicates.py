def removeDuplicates(nums):
    expected_num = []
    for i in range(1,len(nums)):
        success = 0
        if nums[i-1] > nums[i]:
            temp = nums[i-1]
            nums[i-1] = nums[i]
            nums[i] = temp
        else:
            success += 1
        if success == len(nums):
            break
    #print(nums)
    for i in range(1,len(nums)):
        if nums[i-1] != nums[i] and (nums[i-1] not in expected_num):
            expected_num.append(nums[i-1])
        if nums[i-1] != nums[i] and (nums[i] not in expected_num):
            expected_num.append(nums[i])
    #print(expected_num)
    return len(expected_num)

print(removeDuplicates(nums = [1,1,2]))
print(removeDuplicates(nums = [0,0,1,1,1,2,2,3,3,4]))