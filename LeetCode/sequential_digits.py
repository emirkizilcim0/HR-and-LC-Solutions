def sequentialDigits(low: int, high: int):
    res = []
    for number in range(low,high+1):
        number = str(number)
        num_list = list()
        for i in number:
            num_list.append(int(i))
        success = 0
        for i in range(1,len(num_list)):
            if num_list[i]-num_list[i-1] != 1:
                break
            else:
                success += 1
        if success == len(number)-1:
            res.append(int(number))
    return res

print(sequentialDigits(low = 1000, high = 10000))

#assert sequentialDigits(low = 1000, high = 13000) == [1234,2345,3456,4567,5678,6789,12345] , "wrong"
       