from collections import defaultdict
def findDiagonalOrder(nums):
    
    groups = defaultdict(list)      #defaultdict allow you to open an array as you want. you can start applying from whereever you want.
    for row in range(len(nums)-1,-1,-1):
        for col in range(len(nums[row])):
            diagonal = row + col
            groups[diagonal].append(nums[row][col])

            #the above appending means that when any elements of row plus col is equal are in the sequential.
            # we find the same diagonal and add them into new array in the array called 'groups'. For instance, in the first loop, the starting diagonal is 3.
            # we add the element to the 3rd array in the group array. It's that genius thing!!! 
            
            # after we applied this. we do the operation below. 

    res = []
    curr = 0
    while curr in groups:
        res.extend(groups[curr])    # here, we extend the group sequentially from 0.
        curr += 1
    return res

print(findDiagonalOrder([[1,2,3],[4,5,6],[7,8,9]]))
print(findDiagonalOrder(nums = [[1,2,3,4,5],[6,7],[8],[9,10,11],[12,13,14,15,16]]))