def convert( s, numRows):
    if numRows == 1:
        return s
    #slice the string through numRows+1 and save it to a list
    sliced_s = [[]*numRows] #[[],[],[],[],[],[]] numRows times array in it.
    for i in range(len(s)):
        j = 0    
        sliced_s.append(s[i])
        j += 1
        if j == numRows:
            j = 0
    return sliced_s

print(convert(s = "PAYPALISHIRING", numRows = 4))
print(convert(s = "PAYPALISHIRING", numRows = 3))
print(convert(s = "A", numRows = 1))