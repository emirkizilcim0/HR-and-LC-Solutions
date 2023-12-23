def maxScore(s):
    left,right = "",""
    zeros, ones = 0, 0
    res, curr_res = 0, 0 
    for i in range(1,len(s)-1):
        left, right = s[:i], s[i:]
        zeros, ones = left.count("0"), right.count("1")
        curr_res = zeros + ones
        res = max(curr_res, res)
    return res