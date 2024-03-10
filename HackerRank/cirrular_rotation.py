def circularArrayRotation(a, k, queries):
    # Write your code here
    arr = []
    
    for i in range(len(a)):
        arr.append(a[(i+k)%(len(a))-1])
    print(arr)
    for query in queries:
        print(arr[query])

circularArrayRotation([3,4,5], 2, [1,2])