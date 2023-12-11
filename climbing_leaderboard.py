def climbingLeaderboard(ranked, player):
    # Write your code here
    
    #insert the current number.
    #check for the index and add one to find its rank.
    #remove the current number.
    ranked_v = []
    for i in range(1,len(ranked)):
        if ranked[i-1] != ranked[i]:
            ranked_v.append(ranked[i-1])
    ranked_v.append(ranked[-1])
    ranking = []
    for i in range(len(player)):
        ranked_v.append(player[i])
        ranked_v = sorted(ranked_v, reverse=True)
        print(ranked_v)
        ranking.append( 1 + ranked_v.index(player[i])) 
        ranked_v.remove(player[i])  
    return ranking 

print(climbingLeaderboard([100,100,50,50,40,40,20,10],[2,25,50,120]))