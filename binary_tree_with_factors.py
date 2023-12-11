from collections import defaultdict
def numFactoredBinaryTrees(arr):
    
    arr.sort()
    l = defaultdict(int)
    for a in arr:
        print(l)
        tmp = 1
        for b in arr:
            if b > a:
                break
            tmp += (l[b] * l[a/b])
        l[a] = tmp
        
    return sum(l.values())

print(numFactoredBinaryTrees([18,3,6,2]))