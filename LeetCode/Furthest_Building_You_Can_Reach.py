import heapq
class Solution:
    def furthestBuilding(self, heights, bricks: int, ladders: int) -> int:
        #differenceBetweenBuildings = []
        #for i in range(1,len(heights)):
        #    if heights[i] - heights[i-1] > 0:
        #        differenceBetweenBuildings.append(heights[i] - heights[i-1])
        #    else:
        #        differenceBetweenBuildings.append(0)
        #
        #startingPoint = 1
        #maxHeightFoundOnce = False
        #print(differenceBetweenBuildings)
        #for i in range(len(differenceBetweenBuildings)):
        #    if differenceBetweenBuildings[i] != 0:
        #        if differenceBetweenBuildings[i] != max(differenceBetweenBuildings) and bricks > 0:
        #            bricks -= differenceBetweenBuildings[i]
        #            startingPoint += 1
        #        elif differenceBetweenBuildings[i] == max(differenceBetweenBuildings) and ladders != 0 and maxHeightFoundOnce:
        #            maxHeightFoundOnce = True
        #            ladders -= 1
        #            startingPoint += 1
        #    else:
        #        startingPoint += 1
        #return startingPoint

        
        heap = list()
        for i in range(len(heights) - 1):
            diff = heights[i+1] - heights[i]
            if diff <= 0:
                continue
            bricks -= diff
            heapq.heappush(heap, -diff)
            if bricks < 0:
                if ladders == 0:
                    return i
                ladders -= 1
                bricks += -heapq.heappop(heap)

        return len(heights) - 1


a =Solution()

print(a.furthestBuilding(heights = [4,2,7,6,9,14,12], bricks = 5, ladders = 1))