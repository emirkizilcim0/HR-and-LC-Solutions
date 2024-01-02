def findMatrix(nums):
    counts = dict()
    for i in nums:
        counts[i] = counts.get(i, 0) + 1
    values = list(counts.values())
    keys = list(counts.keys())
    max_val = max(values)
    res = [[] for _ in range(max_val)]

    #add the every number from the beginning until there is no left of it.
    #iterate through res' subdimensions.

    indx = 0 #index pointer for the res to iterate and keep track of what's going on. 
    for key in keys:
        while counts[key] > 0:
            res[indx].append(key)
            counts[key] -= 1
            indx += 1
        indx = 0
    return res


print(findMatrix(nums = [1,3,4,1,2,3,1]))
assert findMatrix(nums = [1,3,4,1,2,3,1]) == [[1,3,4,2],[1,3],[1]], "false"