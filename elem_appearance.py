def findSpecialInteger(arr):
    counts = dict()
    res = 0
    for i in arr:
      counts[i] = counts.get(i, 0) + 1
    for i in counts.keys():
       res = max(counts[i], res)
    key_list = list(counts.keys())
    val_list = list(counts.values())
    position = val_list.index(res)
    return key_list[position]


print(findSpecialInteger(arr = [1,2,2,6,6,6,6,7,10]))