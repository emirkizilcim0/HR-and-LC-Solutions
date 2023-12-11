# First Solution without set and list etc.
def pangrams(s):
    # Write your code here    
    s = s.lower()
    check_letters = ""
    for i in range(len(s)):
        if s[i] == " ":
            continue
        if s[i] not in check_letters:
            check_letters += s[i]
        else:
            continue
    return True if len(check_letters) == 26 else False

# Second Solution with set and list (easy and non-efficient)
def pangrams(s):
    # Write your code here
    import string
    letters = 26
    s = s.lower()
    s = list(set(s))
    if " " in s:
        s.remove(" ")
    return True if len(s) == letters else False

print(pangrams("qmExzBIJmdELxyOFWv LOCmefk TwPhargKSPEqSxzveiun"))
print(pangrams("We promptly judged antique ivory buckles for the prize"))