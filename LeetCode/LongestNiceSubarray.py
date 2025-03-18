def longestNiceSubarray(nums):
    left = 0
    right = 0
    max_length = 1
    used_bits = 0 

    while right < len(nums):
        
        while (used_bits & nums[right]) != 0:
            used_bits ^= nums[left]  # Removing
            left += 1
        

        used_bits |= nums[right]    # Adding
        print(used_bits)
        max_length = max(max_length, right - left + 1)
        
        right += 1 
    
    return max_length



print(longestNiceSubarray([1,3,8,48,10]))