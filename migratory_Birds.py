def migratoryBirds(arr):
    # Write your code here
    #from collections import defaultdict
    #l = defaultdict(int)
    #for i in arr:
    #    l[i] += 1
    #return max(l.values())     
    birds = {1 : 0 , 2 : 0, 3 : 0, 4 : 0, 5 : 0}
    for i in arr:
        birds[i] += 1
    return max(birds,key=birds.get)
    
print(migratoryBirds([1,4,4,4,5,3]))