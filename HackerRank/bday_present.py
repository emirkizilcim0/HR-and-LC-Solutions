def beautifulDays(i, j, k):
    # Write your code here
    res = 0
    for number in range(i,j+1):
        if (number - int(str(number)[::-1])) % k == 0: 
            res += 1
    return res

print(beautifulDays(20,23,6))