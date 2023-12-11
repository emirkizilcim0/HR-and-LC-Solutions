def divide(dividend,divisor):
    #ATTEMPT 1

    #counter = 0
    #divided = False
    #while not divided:
    #    if (dividend < 0 and divisor > 0) or (dividend > 0 and divisor < 0):
    #        dividend = dividend + divisor
    #        if (dividend) > (divisor):
    #            counter = -(counter)  #make counter negative due to opposite signs.
    #            divided = True
    #        counter += 1
    #    else:
    #        dividend = dividend - divisor
    #        if (dividend) < (divisor):
    #            divided = True
    #        counter += 1  
    #return counter

    #ATTEMPT 5

    #sign = -1 if (dividend <= 0 and divisor > 0) or (dividend >= 0 and divisor < 0) else 1
    #dividend = abs(dividend)
    #divisor = abs(divisor)
    #result = len(range(0, dividend-divisor+1, divisor))
    #return result * sign


    # ATTEMPT 1684165161651 WORKS!!!!
    
    sign = -1 if (dividend <= 0 and divisor > 0) or (dividend >= 0 and divisor < 0) else 1
    dividend = abs(dividend)
    divisor = abs(divisor)
    result = len(range(0, dividend-divisor+1, divisor))
    result *= sign
    return min(max(result , -(2**31)), (2**31 - 1))

print(divide(7,-3))
print("#################")
print(divide(0,1))