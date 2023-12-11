def jump(nums):
    i = max_reachable = curr_reachable = jumps = 0
    while i < len(nums) - 1:
      max_reachable = max(max_reachable, i + nums[i])
      if i == curr_reachable:
        curr_reachable = max_reachable
        jumps += 1
      i += 1
    return jumps        

print(jump(nums = [2,3,1,1,4]))