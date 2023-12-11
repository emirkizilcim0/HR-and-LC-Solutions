def utopianTree(n):
    # Write your code here
    lengthTree = 1
    i = 0
    while i < n:
        if i % 2 == 0:
            lengthTree *= 2
        else:
            lengthTree += 1
        i += 1
    return lengthTree