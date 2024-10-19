
def caesarCipher(s, k):
    # Write your code here
    alphabet_lower = "abcdefghijklmnopqrstuvwxyz"
    alphabet_upper = alphabet_lower.upper()
    result = ""
    for letter in s:
        if (not alphabet_lower.__contains__(letter)) and (not alphabet_upper.__contains__(letter)):
            result += letter
        else:
            if alphabet_lower.__contains__(letter):
                result += alphabet_lower[(alphabet_lower.index(letter) + k)%len(alphabet_lower)]
            else:
                result += alphabet_upper[(alphabet_upper.index(letter) + k)%len(alphabet_upper)]
        
    return result


print(caesarCipher('middle-Outz', 2))