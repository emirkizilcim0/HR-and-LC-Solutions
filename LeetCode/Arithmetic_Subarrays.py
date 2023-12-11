def checkArithmeticSubarrays(nums,l,r):
    res = []
    for ind in range(len(l)):
        temp_arr = []
        temp_arr = nums[l[ind]:r[ind]+1]
        temp_arr.sort()
        success = 0
        arth = temp_arr[1] - temp_arr[0]
        for i in range(1,len(temp_arr)):
            if temp_arr[i] - temp_arr[i-1] == arth:
                success += 1
            else:
                res.append(False)
                success = 0
                break
            if success == (len(temp_arr))-1:
                res.append(True)
    return res
print(checkArithmeticSubarrays(nums = [4,6,5,9,3,7], l = [0,0,2], r = [2,3,5]))
print(checkArithmeticSubarrays(nums = [-12,-9,-3,-12,-6,15,20,-25,-20,-15,-10], l = [0,1,6,4,8,7], r = [4,4,9,7,9,10]))