def candy(ratings):
    candy = [1] * len(ratings) #every child gets at least one candy.
    
    #check the forward.
    for i in range(1,len(ratings)):
        if ratings[i] > ratings[i-1]:
            candy[i] = candy[i-1] + 1
    #check backward but if the child is not rewarded, give the extra candy.
    for i in range(len(ratings)-2,-1,-1):
        if ratings[i] > ratings[i+1] and candy[i] <= candy[i+1]:
            candy[i] = candy[i+1] + 1

    return sum(candy)