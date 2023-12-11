def pageCount(n, p):
    # Write your code here
    booklet = [0,1]
    booklet_counter = 0
    booklet_reversed = [0,0]
    booklet_reversed_counter = 0
    if n % 2 == 0:
        booklet_reversed = [n,n+1]
    else:
        booklet_reversed = [n-1,n]
    i = 0
    while n > i:
        if p not in booklet:
            booklet[0] += 1
            booklet[1] += 1
        else:
            break
        booklet_counter += 1
    j = 0
    while n > j: 
        if p not in booklet_reversed:
            booklet_reversed[0] -= 1
            booklet_reversed[1] -= 1
        else:
            break
        booklet_reversed_counter +=1
    print(booklet_counter , booklet_reversed_counter)
    return min(booklet_reversed_counter, booklet_counter)

print(pageCount(7,3))
            