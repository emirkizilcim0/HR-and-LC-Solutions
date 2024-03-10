def birtyday(s, d, m):
    res = list()
    if len(s) == 1:
        return 1 if s[0] == d else 0
    for i in range(len(s)-m+1):
        if sum(s[i:i+m]) == d:
            res.append(s[i:i+m])
        
    return len(res)


print(birtyday([2,2,1,3,2],4,2))