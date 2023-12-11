def longestPalindrome(s):
    ans = ""
    for i in range(len(s)): 
        for j in range(i+1+len(ans),len(s)+1): 
            word = s[i:j]
            if word == word[::-1]:
                ans = word
    return ans




print(longestPalindrome("abbcccc"))