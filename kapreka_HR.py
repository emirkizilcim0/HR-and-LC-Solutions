def kaprekarNumbers(p, q):
    # Write your code here
    ans = []
    if 1 in range(p,q):
        print(1 , end=' ')
    for n in range(p,q+1):
        if n <= 3:
            continue
        d = len(str(n))
        string = str(n**2)
        firstpart, secondpart = string[:len(str(n**2))//2], string[len(str(n**2))//2:]

        summary = int(float(firstpart))+ int(float(secondpart))
        if summary == n:
            ans.append(n)
        else:
            continue
    if ans:
        for i in range(len(ans)):
            print(ans[i], end=' ')
    else:
        return "INVALID RANGE" 

print(kaprekarNumbers(400,700))