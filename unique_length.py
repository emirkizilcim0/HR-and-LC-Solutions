def countPalindromicSubsequence(s):
    #count_letters = dict()
    #for letter in s:
    #    count_letters[letter] = 0
    #for letter in s:
    #    count_letters[letter] += 1
    #all_one = 0
    #for letter in count_letters:
    #    if count_letters[letter] == 1:
    #        all_one += 1
    #
    #if all_one == len(s):
    #    return 0
    #palindrom_strings = []
    #for letter in count_letters:
    #    palindrom_string = ""
    #    if count_letters[letter] > 1:
    #        palindrom_string += letter
    #        count_letters[letter] -= 1
    #    if count_letters[letter] == 1 and count_letters[palindrom_string[0]] != 1:
    #        palindrom_string += letter
    #        count_letters[letter] -= 1
    #    if count_letters[letter] == 0:
    #        count_letters.pop(count_letters[letter])
    #    if len(palindrom_string) == 3:
    #        palindrom_strings.append(palindrom_string)
    #        palindrom_string = ""
    #return len(palindrom_strings)
        

        
print(countPalindromicSubsequence(s = "aabca"))
print(countPalindromicSubsequence("adc"))
print(countPalindromicSubsequence(s = "bbcbaba"))