
def reverse(x):
    isNegative = False
    reverse = x
    ab = 0
    if x < 0:
        isNegative = True
        x = abs(x)
    while(x != 0):
        digit = x % 10
        x = x // 10
        if reverse > 2**31//10:
            return 0
        if reverse < (-(2**31)-1)//10:
            return 0
        
        reverse = 10 * reverse + digit
    if isNegative:
        reverse = -reverse
    return reverse

print(reverse(123))