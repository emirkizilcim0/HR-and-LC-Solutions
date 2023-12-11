def numBusesToDestination(routes,source,target):
    # i need to check if there are same numbers in source and target.
    # there is an posibility that there can be no source and no target but same numbers so they can link through it.
    have_source = []
    for route in routes:
        if source in route:
            have_source.append(route)
    have_target = []
    for route in routes:
        if target in route:
            have_target.append(route)
    
    print(have_source)
    changed_route = 0

    if changed_route == 0:
        return -1
    return changed_route


print(numBusesToDestination(routes = [[1,2,7],[3,6,7]], source = 1, target = 6))