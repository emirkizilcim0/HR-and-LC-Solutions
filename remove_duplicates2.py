def removeDuplicates(nums):
    nums.sort()
    num_set = list(set(nums))
    counter = 0
    for i in range(len(num_set)):
        counter = nums.count(num_set[i])
        if counter > 2:
            for _ in range(counter - 2):
                nums.remove(num_set[i])
        else:
            continue
    return len(nums)

print(removeDuplicates(nums = [1,1,1,2,2,3]))