# Binary Search Algorithm
def mySqrt(x):
    
    if x == 1 or x == 0:
        return 1 if x == 1 else 0
    
    # Creating a list for binary search examination.
    nums = [num for num in range(((x+1)//2)//2,(x+1)//2)]
    
    left = 0
    right = len(nums) - 1
    middle = 0
    i = 0
    min_value = 0
    while i < 25:
        middle = (left+right) // 2
        
        if nums[middle] * nums[middle] > x:
            right = middle
        elif nums[middle] * nums[middle] < x:
            left = middle
            min_value = nums[middle]
        else:
            min_value = nums[middle]
            break
        i += 1
    
    return min_value

print(mySqrt(2147395599))