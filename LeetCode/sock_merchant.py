def sockMerchant(ar):
    # Write your code here
    new_ar = set(ar)
    total = 0
    counts = dict()
    for i in ar:
        counts[i] = counts.get(i, 0) + 1
    for i in new_ar:
        total += counts[i] // 2
    return total


print(sockMerchant([10, 20, 20, 10, 10, 30, 50, 10, 20]))