def countingValleys(path):
    # Write your code here
    valley = 0
    current_altitude = 0
    current_altitude_showcase = []
    for i in path:
        if i == "U":
            current_altitude += 1
        else:
            current_altitude -= 1
        current_altitude_showcase.append(current_altitude)
    for i in range(1,len(current_altitude_showcase)):
        if current_altitude_showcase[i-1] < 0:
            if current_altitude_showcase[i] >= 0:
                valley += 1
        else:
            continue


    return valley


print(countingValleys("UDDDUDUU"))
print(countingValleys("DDUUDDUDUUUD"))