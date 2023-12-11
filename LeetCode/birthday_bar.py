def birthday(s, d, m):
    # Write your code here
    if len(s) == 1 and s[0] == d:
        return 1

    attain = 0
    for i in range(len(s)-m):
        summary = 0
        j = i
        for j in range(j,j+m):
            summary += s[j]
            if summary == d:
                if len(s) - m != 0:
                    attain += 1
                else:
                    continue

    return attain  

s = [3 ,2 ,1 ,1 ,2]
m = 2
d = 3
print(birthday(s,d,m))

################################################

lst = [1,2,3,4,5,6,7,8] 
def sliding_window(elements, window_size):
    
    if len(elements) <= window_size:
       return elements
    for i in range(len(elements)- window_size + 1):
        print(elements[i:i+window_size])
sliding_window(lst, 3)
#Output:
#[1, 2, 3] 
#[2, 3, 4] 
#[3, 4, 5] 
#[4, 5, 6] 
#[5, 6, 7] 
#[6, 7, 8]

