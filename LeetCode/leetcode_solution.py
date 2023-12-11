
def findMedianSortedArrays(nums1, nums2):
    compound_arr = []
    l = 0
    if len(nums1) > len(nums2):
        l = len(nums2)
    else:
        l = len(nums1)
    i = 0
    k = 0
    for i in range(l):
        if nums1[i] < nums2[i]:
            compound_arr.append(nums1[i])
            compound_arr.append(nums2[i])
        else:
            compound_arr.append(nums1[i])
            compound_arr.append(nums2[i])
        k += 1

    #print(k)
    print(compound_arr)
    if len(nums1) > len(nums2):
        for a in range(k,l+1):
            compound_arr.append(nums1[a])
    else:
        for a in range(k,l):
            compound_arr.append(nums2[a])
    
    #print(compound_arr)
    #compound_arr=sorted(compound_arr)
    #print(compound_arr)
    #compound_arr = [float(i) for i in compound_arr]
    if len(compound_arr) % 2 == 0:
        return (compound_arr[(len(compound_arr)//2)-1] + compound_arr[(len(compound_arr)//2)])/2
    else:
        return compound_arr[(len(compound_arr)//2)]
        
        
print(findMedianSortedArrays( nums1 = [1,2,3,4], nums2 = [6,9]))