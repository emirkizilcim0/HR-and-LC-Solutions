def isPathCrossing(path):
    coordinates_visited = {(0,0)}
    x, y = 0, 0
    for i in range(len(path)):
        if path[i] == "N":
            y += 1
        elif path[i] == "E":
            x += 1
        elif path[i] == "W":
            x -= 1
        elif path[i] == "S":
            y -= 1
        if (x,y) in coordinates_visited:
            return True
        else:
            coordinates_visited.add((x,y))
    return False

print(isPathCrossing(path = "NES"))