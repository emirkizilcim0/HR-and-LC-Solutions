def majorityElement(nums):
    counts = dict()
    for i in nums:
        counts[i] = counts.get(i,0) + 1
    values = list(counts.values())
    keys = list(counts.keys())
    return keys[values.index(max(values))]

print(majorityElement(nums = [2,2,1,1,1,2,2]))
