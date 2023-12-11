def hIndex(citations):
    citations_rev = sorted(citations, reverse=True)
    papers = len(citations)
    if papers == 1 and citations[0] > 0:
        return 1
    if citations_rev[-1] >= papers:
        return papers 
    for i in range(len(citations_rev)):
        if i + 1 > citations_rev[i]:
            return i
    return 0


print(hIndex([25,8,5,3,3]))

#print(hIndex(citations =[0]))
#print(hIndex(citations = [1,3,1]))
#print(hIndex(citations = [3,0,6,1,5]))
