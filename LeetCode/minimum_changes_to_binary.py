def minOperations(s):
    check_1, check_2 = "", ""
    for i in range(len(s)):
        if i % 2 == 0:
            check_1 += "0"
            check_2 += "1"
        else:
            check_1 += "1"
            check_2 += "0"
    min_change_1 , min_change_2 = 0, 0
    
    for i in range(len(check_1)):
        if s[i] != check_1[i]:
            min_change_1 += 1
        if s[i] != check_2[i]:
            min_change_2 += 1
    return min(min_change_1, min_change_2)

print(minOperations(s = "0100"))