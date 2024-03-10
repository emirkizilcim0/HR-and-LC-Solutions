def findLeastNumOfUniqueInts(arr, k):
    counts = dict()
    for i in arr:
        counts[i] = counts.get(i ,0) + 1
    values = list(counts.values())
    n = len(values)
    values.sort()
    summation = 0
    i = 0
    for i in range(9999):
        if i >= len(values):
            break
        if summation + values[i] <= k:
            summation += values[i]
        else:
            break
    
    print(values[i:])
    return len(values[i:])

print(findLeastNumOfUniqueInts(arr = [5,5,4], k = 1))   
print(findLeastNumOfUniqueInts(arr = [4,3,1,1,3,3,2], k = 3))
print(findLeastNumOfUniqueInts(arr =[1,2,3], k = 3))