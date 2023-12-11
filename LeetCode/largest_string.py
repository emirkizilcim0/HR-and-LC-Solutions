

#IT SOLVES THE PROBLEM BUT IT EXCEEDS THE TIME LIMIT SADLY :((((

def largestGoodInteger(num):
    res = []
    success = 0
    for i in range(1,len(num)):
        if num[i-1] == num[i]:
            success += 1
        else:
            success = 0
            continue
        if success == 2:
            res.append(num[i-1])
            success = 0
    if len(res) == 1:
        return res[0]*3
    else:
        success2,i = 0,0
        isSorted = False
        while not isSorted:
            for i in range(1,len(res)):
                if ord(res[i-1]) <= ord(res[i]):
                    success2 += 1
                else:
                    res[i-1], res[i] = res[i], res[i-1]
                    success = 0
                if success2 == len(res):
                    isSorted = True
        return res[-1]*3
    

#It does solve the problem efficiently.

#def largestGoodInteger(num):
    res = []
    success = 0
    for i in range(1,len(num)):
        if num[i-1] == num[i]:
            success += 1
        else:
            success = 0
            continue
        if success == 2:
            res.append(num[i-1])
            success = 0
    if len(res) == 1:
        return res[0]*3
    elif len(res) == 0:
        return ""
    else:
        res_int = []
        for number in res:
            res_int.append(int(number))
        res_int = sorted(res_int)
        return str(res_int[-1])*3


print(largestGoodInteger(num = "4818042931906802860005960222213336669500011846936171709111"))