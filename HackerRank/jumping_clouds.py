def jumpingOnClouds(c, k):
    
    initialEnergy = 100
    indx = 0

    while True:
        indx = (indx+k)%len(c)
        initialEnergy -= 3 if c[indx] == 1 else 1
        if indx == 0:
            break

    return initialEnergy    

print(jumpingOnClouds([1 ,1 ,0 ,1 ,0, 1 ,0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1], 19))