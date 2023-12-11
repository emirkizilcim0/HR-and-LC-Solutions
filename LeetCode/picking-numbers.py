def pickingNumbers(a):
    # Write your code here
    a = sorted(a)
    counter = 0
    counterMax = 0
    for i in range(1,len(a)):
        if i == len(a) - 1:
            break
        if a.count(a[0]) == len(a) or a.count(a[0]) == len(a)//2:
            return a.count(a[0])
        if abs(a[i-1] - a[i]) <= 1 and a[i-1] != a[i]:
            counter = a.count(a[i-1]) + a.count(a[i])
        counterMax = max(counter , counterMax)
    return counterMax


print(pickingNumbers([1,2,2,3,1,2]))