def divisibleSumPairs(k, ar):
    # Write your code here
    attain = 0
    used_pairs = []
    for i in range(len(ar)):
        for j in range(1,len(ar)):
            test = []
            if (ar[i] + ar[j]) % k == 0 and i < j:
                test.append(i)
                test.append(j)
                used_pairs.append(test)
    print(used_pairs)
    
    return len(used_pairs)

print(divisibleSumPairs(3,[1,3,2,6,1,2]))