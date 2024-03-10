def lengthOfLIS(nums):
    #remove all the repeating elements in "nums".
    num_replica = list(nums)
    n = len(num_replica)
    for i in range(n-1):
        for j in range(i+1,n):
            if num_replica[i] == num_replica[j]:
                nums.remove(num_replica[j])
    return nums
    
    
    #find the min value in the array as the starting point.
    

    #the thing we want is that we want the difference between elements are increasingly placed.
    





print(lengthOfLIS(nums = [10,9,2,5,3,7,101,18]))
print(lengthOfLIS(nums = [0,1,0,3,2,3]))