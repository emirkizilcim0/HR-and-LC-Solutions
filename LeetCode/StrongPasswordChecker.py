class Solution:
    def strongPasswordChecker(self, password: str) -> int:
        lowerLetters = "qwertyuopasdfghjklizxcvbnm"
        upperLetters = lowerLetters.upper()
        numbers = "0123456789"
        hasLower, hasUpper, hasNumber, isRepeating = 1, 1, 1, 0
        repeating, previous_letter = 1, ""

        if len(password) < 6:
            return 6 - len(password)

        for i in range(len(password)):
            if password[i] in lowerLetters:
                hasLower = 0
            if password[i] in upperLetters:
                hasUpper = 0
            if password[i] in numbers:
                hasNumber = 0
            if repeating == 3:
                isRepeating = 1
            
            if password[i] == previous_letter:
                repeating += 1
            else:
                repeating = 0

            previous_letter = password[i]
        print(hasLower, hasUpper, hasNumber , isRepeating)
        return hasLower + hasUpper + hasNumber + isRepeating
    
a = Solution()
print(a.strongPasswordChecker(password = "1337C0d3"))
