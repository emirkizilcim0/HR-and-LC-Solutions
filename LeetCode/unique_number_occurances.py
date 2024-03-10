def uniqueOccurrences(arr):
    counts = dict()
    for i in arr:
        counts[i] = counts.get(i,0) + 1
    values = list(counts.values()) 
    values.sort() 
    print(values)
    for i in range(1,len(values)):
        if values[i-1] == values[i]:
            return False
    return True

print(uniqueOccurrences(arr = [1,2]))
print(uniqueOccurrences(arr = [1,2,2,1,1,3]))
print(uniqueOccurrences(arr = [-3,0,1,-3,1,1,1,-3,10,0]))