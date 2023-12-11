def totalMoney(n):
    week_repeat, day_left = divmod(n,7)
    i = -1
    initial_monday_money ,res = 1,0
    while i < week_repeat:
        curr_res, curr_initial_monday_money = 0, initial_monday_money
        if i != week_repeat - 1:
            for _ in range(7):
                curr_res += curr_initial_monday_money
                curr_initial_monday_money += 1
            initial_monday_money = initial_monday_money + 1
            res += curr_res
        else:
            for _ in range(day_left):
                curr_res += curr_initial_monday_money
                curr_initial_monday_money += 1
            res += curr_res
        i += 1
    return res


print(totalMoney(20))
print(totalMoney(2)) 