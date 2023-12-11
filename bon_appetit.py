def bonAppetit(bill, k, b):
    # Write your code here
    actual_pay = 0
    paid_pay = 0
    for i in range(len(bill)):
        if bill[i] != bill[k]:
            paid_pay += bill[i]
    
    for i in range(len(bill)):
        actual_pay += bill[i]

    paid_pay_a = paid_pay//2
    actual_pay_a = actual_pay//2
    print(paid_pay, actual_pay)

    if actual_pay_a - paid_pay_a < b:
        print( (actual_pay - paid_pay) - b) 
    else:
        print("Bon Appetit")

bonAppetit([3,10,2,9],1,12)