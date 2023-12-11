def getTotalX(a, b):
    # Write your code here
    success = 0
    dividors = []

    if len(a) == 1:
        for i in range(len(b)):
            if b[i] % a[0] == 0:
                dividors.append(b[i])
                return len(dividors)
            
    if len(a) == 1 and len(b) == 1:
        

        for i in range(len(a)):
            for j in range(1,len(a)):
                if a[j] % a[i] == 0:
                    success += 1
                if success == len(a)-1:
                    dividors.append(a[i])
        for i in range(len(dividors)):
            for j in range(len(b)):
                if b[j] % dividors[i] == 0:
                    dividors.append(b[j])
        return len(dividors) - 1

print(getTotalX([2],[20,30,12]))