def myAtoi(s):
    matchedSigns = "" 
    res = ""
    sign = 1
    isNum = False
    s = s.strip()

    for i in s:
        if i == "-" and isNum != True:
            sign = - sign
            matchedSigns += i
        elif i == "+" and isNum != True:
            matchedSigns += i
            continue
        elif ord("0")<=ord(i)<=ord("9"):
            res += i
            isNum = True
        elif not ord("0")<=ord(i)<=ord("9"):
            break

    if res == "" or len(matchedSigns) > 1:
        return 0
    else:
        res = int(res)
        if sign == -1:
            res = - res
        return min(max(res, -2**31), (2**31) - 1)


print(myAtoi("00000-42a1234"))



class Solution:
    def myAtoi(self, s: str) -> int:
        s=s.strip()
        sign=1
        l=""
        res=""
        num=False

        for i in s:

            #checking if there are + and - at the same time.
            if i=='-' and num!= True:
                sign*=-1
                l+=i
            elif i=='+' and num!=True:
                l+=i
                continue

            #checking if there is a letter between numbers and otherwise.
            elif ord('0')<=ord(i)<=ord('9'):
                res+=i
                num=True
            elif not ord('0')<=ord(i)<=ord('9'):
                break
            

        if res=="" or len(l)>1:
            return 0
        else:

            if (int(res)*sign)>2**31 -1:
                return 2**31 - 1
            elif (int(res)*sign)<(-2)**31:
                return (-2)**31
            return int(res)*sign


