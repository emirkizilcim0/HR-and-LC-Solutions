def trap(height):
    m = len(height)
    filled_water = 0
    if len(height) <= 2:
        return 0
    maxLefts = []
    lmax = 0
    for i in range(m):
        lmax = max(height[i], lmax)
        maxLefts.append(lmax)
    maxRights = []
    rmax = 0
    for i in range(m-1,-1,-1):
        rmax = max(height[i], rmax)
        maxRights.append(rmax)
    maxRights = maxRights[::-1]
    
    minHeights = []
    for i in range(m):
        minHeights.append(min(maxLefts[i],maxRights[i]))
    for i in range(m):
        if minHeights[i] - height[i] > 0:
            filled_water += minHeights[i] - height[i]
            
    return filled_water


print(trap(height = [0,1,0,2,1,0,1,3,2,1,2,1]))