def prime_factors(n):
    
    is_N_prime = True
    for divisor in range(2,int(n**(1/2))):
        if n % divisor == 0:
            is_N_prime = False

    if is_N_prime:
        return "(" + str(n) + ")" 
        
    primeNumbers = list()
    #Defining the prime numbers until n.
    for number in range(2,int(n**(1/2))):
        isPrime = True
        for divisor in range(2,number):
            if number % divisor == 0:
                isPrime = False
                break
        if isPrime:
            primeNumbers.append(number)
    print(primeNumbers)
    
    #counting how many times used each number.
    counts = dict()
    i = 0
    while n != 0:
        if i >= len(primeNumbers):
            break
        if n % primeNumbers[i] == 0:
            n //= primeNumbers[i]
            counts[primeNumbers[i]] = counts.get(primeNumbers[i] , 0) + 1
        else:
            i += 1
    #printing the result.
    result = ""
    keys, values = list(counts.keys()), list(counts.values())
    keysAndValues = list(zip(keys,values))

    for key, value in keysAndValues:
        if value == 1:
            result += "(" + str(key) + ")"
        else:
            result += "(" + str(key) + "**" + str(value) + ")"
    return result

print(prime_factors(5113051*7))