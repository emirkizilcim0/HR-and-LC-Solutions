def perimeter(n):
    # your code
   
    memo = { 1 : 1}
    def fib(n):
        if n <= 0:
            return 0
        elif n == 1:
            return 1
        elif n in memo:
            return memo[n]
        else:
            memo[n] = fib(n-1) + fib(n-2)
            return memo[n]
    fib(n=n)
    values = list(memo.values())
    return sum(values) * 4

print(perimeter(6))