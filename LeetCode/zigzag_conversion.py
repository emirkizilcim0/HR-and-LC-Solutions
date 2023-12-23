def convert(s, numRows):
    i = 0
    k = 0
    move_right = 0
    res, ans = [[""] * len(s) for _ in range(numRows)], ""
    allSet = False 
    while not allSet:
        res[i].insert(move_right,s[k])
        i += 1
        if i == numRows:
            k += 1
            for j in range(-2,-numRows):
                move_right += 1
                res[j].insert(move_right,s[k])
                k += 1
                if k==len(s):
                    allSet = True
            i = 0
        else:
            k += 1
        if k == len(s):
            allSet = True
    
    print(res)

    for i in range(len(res)):
        for j in range(len(res)):
            if res[i][j] != "":
                ans += res[i][j]
            else:
                continue
    return ans

if convert(s = "PAYPALISHIRING", numRows = 4) == "PINALSIGYAHRPI":
    print("yes")
else:
    print("no")